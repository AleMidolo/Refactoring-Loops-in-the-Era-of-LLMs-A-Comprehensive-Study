sheet.stream().skip(1)
    .filter(row -> !XLSUtil.isEmpty(row))
    .map(row -> {
        Cell varnameCell = row.getCell(varnameColumnIndex);
        if (varnameCell == null || StringUtil.isEmpty(varnameCell.getStringCellValue())) {
            throw BeneratorExceptionFactory.getInstance().configurationError("'varname' cell empty in table row #" + (row.getRowNum() + 1));
        }
        Anonymization anon = new Anonymization(varnameCell.getStringCellValue());
        return new AbstractMap.SimpleEntry<>(row, anon);
    })
    .forEach(entry -> {
        Row row = entry.getKey();
        Anonymization anon = entry.getValue();
        IntStream.range(0, varnameColumnIndex)
            .forEach(colnum -> {
                Cell cell = row.getCell(colnum);
                String path = (cell != null ? cell.getStringCellValue() : null);
                if (!StringUtil.isEmpty(path)) {
                    List<String> tokens = XPathTokenizer.tokenize(path);
                    String entityPath = XPathTokenizer.merge(tokens, 0, tokens.size() - 2);
                    String entity = normalizeXMLPath(XPathTokenizer.nodeName(tokens.get(tokens.size() - 2)));
                    String attribute = normalizeXMLPath(tokens.get(tokens.size() - 1));
                    anon.addLocator(new Locator(files.get(colnum), path, entityPath, entity, attribute));
                }
            });
        
        IntStream.range(varnameColumnIndex + 1, row.getLastCellNum() - 1)
            .filter(colnum -> colnum % 2 == 0)
            .forEach(colnum -> {
                String key = row.getCell(colnum).getStringCellValue();
                String value = row.getCell(colnum + 1).getStringCellValue();
                if (!StringUtil.isEmpty(key) && !StringUtil.isEmpty(value)) {
                    anon.addSetting(key, value);
                }
            });
        
        anonymizations.add(anon);
    });