for (int colnum = varnameColumnIndex + 1; colnum < row.getLastCellNum() - 1; colnum += 2) {
    String key = row.getCell(colnum).getStringCellValue();
    String value = row.getCell(colnum + 1).getStringCellValue();
    if (!StringUtil.isEmpty(key) && !StringUtil.isEmpty(value)) {
        anon.addSetting(key, value);
    }
}