cells.stream()
     .map(this::cellData2sheetCellData)
     .forEach(cellDatas::add);