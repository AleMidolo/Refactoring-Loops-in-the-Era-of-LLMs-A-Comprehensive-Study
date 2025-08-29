columns.stream()
        .map(c -> new com.google.refine.model.Column(c.cellIndex, c.name))
        .forEach(column -> project.columnModel.columns.add(column));