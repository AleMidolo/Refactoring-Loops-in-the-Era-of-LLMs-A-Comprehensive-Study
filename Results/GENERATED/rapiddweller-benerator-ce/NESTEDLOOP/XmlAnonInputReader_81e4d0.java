sheet.rowStream()
        .filter(row -> !XLSUtil.isEmpty(row))
        .map(row -> {
            Cell varnameCell = row.getCell(varnameColumnIndex);
            if (varnameCell == null || StringUtil.isEmpty(varnameCell.getStringCellValue())) {
                throw BeneratorExceptionFactory.getInstance().configurationError("'varname' cell empty in table row #" + (row.getRowNum() + 1));
            }
            Anonymization anon = new Anonymization(varnameCell.getStringCellValue());
            IntStream.range(0, varnameColumnIndex)
                    .mapToObj(colnum -> row.getCell(colnum))
                    .map(cell -> cell != null ? cell.getStringCellValue() : null)
                    .filter(path -> !StringUtil.isEmpty(path))
                    .map(path -> {
                        List<String> tokens = XPathTokenizer.tokenize(path);
                        String entityPath = XPathTokenizer.merge(tokens, 0, tokens.size() - 2);
                        String entity = normalizeXMLPath(XPathTokenizer.nodeName(tokens.get(tokens.size() - 2)));
                        String attribute = normalizeXMLPath(tokens.get(tokens.size() - 1));
                        return new Locator(files.get(row.getSheet().getColumnIndex(path)), path, entityPath, entity, attribute);
                    })
                    .forEach(anon::addLocator);

            IntStream.range(varnameColumnIndex + 1, row.getLastCellNum() - 1)
                    .filter(colnum -> colnum % 2 == 1)
                    .mapToObj(row::getCell)
                    .map(Cell::getStringCellValue)
                    .forEach(key -> {
                        String value = row.getCell(row.getColumnIndex(key) + 1).getStringCellValue();
                        if (!StringUtil.isEmpty(value)) {
                            anon.addSetting(key, value);
                        }
                    });

            return anon;
        })
        .forEach(anonymizations::add);