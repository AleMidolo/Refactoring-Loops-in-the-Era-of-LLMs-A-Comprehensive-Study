project.columnModel.columns.stream()
    .map(Column::getName)
    .forEach(name -> sb.append(name).append("; "));