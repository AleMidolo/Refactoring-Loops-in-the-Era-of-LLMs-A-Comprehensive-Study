IntStream.range(varnameColumnIndex + 1, row.getLastCellNum() - 1)
    .filter(colnum -> colnum % 2 == 0)
    .forEach(colnum -> {
        String key = row.getCell(colnum).getStringCellValue();
        String value = row.getCell(colnum + 1).getStringCellValue();
        if (!StringUtil.isEmpty(key) && !StringUtil.isEmpty(value)) {
            anon.addSetting(key, value);
        }
    });