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