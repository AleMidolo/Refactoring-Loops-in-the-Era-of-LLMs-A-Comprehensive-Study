for (int i = 0; i <= headerRow.getLastCellNum(); i++) {
    String header = headerRow.getCell(i).getStringCellValue();
    if ("varname".equals(header)) {
        varnameColumnIndex = i;
        break;
    } else {
        if (StringUtil.isEmpty(header)) {
            throw BeneratorExceptionFactory.getInstance().configurationError("Filename missing in column header #" + i + " of Excel document " + xlsUri);
        }
        files.add(header);
    }
}