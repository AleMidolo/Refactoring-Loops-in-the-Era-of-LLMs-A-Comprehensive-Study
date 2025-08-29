sheet.stream().skip(1).limit(sheet.getLastRowNum() - 1)
    .map(rownum -> sheet.getRow(rownum))
    .filter(row -> !XLSUtil.isEmpty(row))
    .forEach(row -> {
        Cell varnameCell = row.getCell(varnameColumnIndex);
        if (varnameCell == null || StringUtil.isEmpty(varnameCell.getStringCellValue())) {
            throw BeneratorExceptionFactory.getInstance().configurationError("'varname' cell empty in table row #" + (row.getRowNum() + 1));
        }
        Anonymization anon = new Anonymization(varnameCell.getStringCellValue());
        
        IntStream.range(0, varnameColumnIndex)
            .mapToObj(colnum -> row.getCell(colnum))
            .map(cell -> cell != null ? cell.getStringCellValue() : null)
            .filter(path -> !StringUtil.isEmpty(path))
            .forEach(path -> {
                List<String> tokens = XPathTokenizer.tokenize(path);
                String entityPath = XPathTokenizer.merge(tokens, 0, tokens.size() - 2);
                String entity = normalizeXMLPath(XPathTokenizer.nodeName(tokens.get(tokens.size() - 2)));
                String attribute = normalizeXMLPath(tokens.get(tokens.size() - 1));
                anon.addLocator(new Locator(files.get(row.getCell(colnum).getColumnIndex()), path, entityPath, entity, attribute));
            });
        
        IntStream.range(varnameColumnIndex + 1, row.getLastCellNum() - 1)
            .filter(colnum -> colnum % 2 == 0)
            .mapToObj(colnum -> {
                String key = row.getCell(colnum).getStringCellValue();
                String value = row.getCell(colnum + 1).getStringCellValue();
                return new AbstractMap.SimpleImmutableEntry<>(key, value);
            })
            .filter(entry -> !StringUtil.isEmpty(entry.getKey()) && !StringUtil.isEmpty(entry.getValue()))
            .forEach(entry -> anon.addSetting(entry.getKey(), entry.getValue()));
        
        anonymizations.add(anon);
    });