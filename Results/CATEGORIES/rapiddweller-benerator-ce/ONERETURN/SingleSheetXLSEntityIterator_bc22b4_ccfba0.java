for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
    Sheet candidate = workbook.getSheetAt(i);
    if (candidate.getSheetName().trim().equalsIgnoreCase(tabName.trim())) {
        return candidate;
    }
}