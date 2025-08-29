IntStream.rangeClosed(0, headerRow.getLastCellNum())
    .forEach(i -> {
        String header = headerRow.getCell(i).getStringCellValue();
        if ("varname".equals(header)) {
            varnameColumnIndex = i;
            return;
        }
        
        if (StringUtil.isEmpty(header)) {
            throw BeneratorExceptionFactory.getInstance().configurationError("Filename missing in column header #" + i + " of Excel document " + xlsUri);
        }
        
        files.add(header);
    });