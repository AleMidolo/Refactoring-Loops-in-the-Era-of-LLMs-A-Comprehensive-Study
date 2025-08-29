sheet.stream()
    .skip(1)
    .limit(sheet.getLastRowNum() - 1)
    .map(rowNum -> sheet.getRow(rowNum))
    .filter(row -> !XLSUtil.isEmpty(row))
    .forEach(row -> {
        Cell varnameCell = row.getCell(varnameColumnIndex);
        if (varnameCell == null || StringUtil.isEmpty(varnameCell.getStringCellValue())) {
            throw BeneratorExceptionFactory.getInstance().configurationError("'varname' cell empty in table row #" + (row.getRowNum() + 1));
        }
        Anonymization anon = new Anonymization(varnameCell.getStringCellValue());

        IntStream.range(0, varnameColumnIndex)
                .mapToObj(colNum -> row.getCell(colNum))
                .forEach(cell -> {
                    String path = (cell != null ? cell.getStringCellValue() : null);
                    if (!StringUtil.isEmpty(path)) {
                        List<String> tokens = XPathTokenizer.tokenize(path);
                        String entityPath = XPathTokenizer.merge(tokens, 0, tokens.size() - 2);
                        String entity = normalizeXMLPath(XPathTokenizer.nodeName(tokens.get(tokens.size() - 2)));
                        String attribute = normalizeXMLPath(tokens.get(tokens.size() - 1));
                        anon.addLocator(new Locator(files.get(colNum), path, entityPath, entity, attribute));
                    }
                });

        IntStream.range(varnameColumnIndex + 1, row.getLastCellNum() - 1)
                .filter(colNum -> colNum % 2 == 1)
                .mapToObj(colNum -> Arrays.asList(row.getCell(colNum).getStringCellValue(), row.getCell(colNum + 1).getStringCellValue()))
                .filter(pair -> !StringUtil.isEmpty(pair.get(0)) && !StringUtil.isEmpty(pair.get(1)))
                .forEach(pair -> anon.addSetting(pair.get(0), pair.get(1)));

        anonymizations.add(anon);
    });