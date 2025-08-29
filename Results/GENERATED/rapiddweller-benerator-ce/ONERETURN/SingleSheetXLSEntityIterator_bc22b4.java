return IntStream.range(0, workbook.getNumberOfSheets())
    .mapToObj(workbook::getSheetAt)
    .filter(sheet -> sheet.getSheetName().trim().equalsIgnoreCase(tabName.trim()))
    .findFirst()
    .orElse(null);