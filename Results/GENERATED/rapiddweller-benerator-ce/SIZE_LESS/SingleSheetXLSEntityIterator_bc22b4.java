return IntStream.range(0, workbook.getNumberOfSheets())
    .mapToObj(workbook::getSheetAt)
    .filter(candidate -> candidate.getSheetName().trim().equalsIgnoreCase(tabName.trim()))
    .findFirst()
    .orElse(null);