_project.rows.stream()
        .skip(_record.fromRowIndex)
        .limit(_record.toRowIndex - _record.fromRowIndex)
        .map(row -> row.getCell(cellIndex))
        .filter(Objects::nonNull)
        .filter(cell -> ExpressionUtils.isNonBlankData(cell.value))
        .map(cell -> new WrappedCell(project, name, cell))
        .forEach(cells::add);