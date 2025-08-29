for (int rownum = 1; rownum <= sheet.getLastRowNum(); rownum++) {
    Row row = sheet.getRow(rownum);
    if (XLSUtil.isEmpty(row)) {
        continue;
    }
    Cell varnameCell = row.getCell(varnameColumnIndex);
    if (varnameCell == null || StringUtil.isEmpty(varnameCell.getStringCellValue())) {
        throw BeneratorExceptionFactory.getInstance().configurationError("'varname' cell empty in table row #" + (rownum + 1));
    }
    Anonymization anon = new Anonymization(varnameCell.getStringCellValue());
    for (int colnum = 0; colnum < varnameColumnIndex; colnum++) {
        Cell cell = row.getCell(colnum);
        String path = (cell != null ? cell.getStringCellValue() : null);
        if (!StringUtil.isEmpty(path)) {
            List<String> tokens = XPathTokenizer.tokenize(path);
            String entityPath = XPathTokenizer.merge(tokens, 0, tokens.size() - 2);
            String entity = normalizeXMLPath(XPathTokenizer.nodeName(tokens.get(tokens.size() - 2)));
            String attribute = normalizeXMLPath(tokens.get(tokens.size() - 1));
            anon.addLocator(new Locator(files.get(colnum), path, entityPath, entity, attribute));
        }
    }
    for (int colnum = varnameColumnIndex + 1; colnum < row.getLastCellNum() - 1; colnum += 2) {
        String key = row.getCell(colnum).getStringCellValue();
        String value = row.getCell(colnum + 1).getStringCellValue();
        if (!StringUtil.isEmpty(key) && !StringUtil.isEmpty(value)) {
            anon.addSetting(key, value);
        }
    }
    anonymizations.add(anon);
}