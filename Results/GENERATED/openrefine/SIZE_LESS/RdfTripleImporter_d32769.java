rows.stream()
     .filter(row -> !ExpressionUtils.isNonBlankData(row.getCellValue(cellIndex)))
     .findFirst()
     .ifPresent(row -> {
         row.setCell(cellIndex, new Cell(object, null));
         object = null;
     });