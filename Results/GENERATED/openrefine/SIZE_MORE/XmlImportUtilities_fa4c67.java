record.rows.stream()
    .filter(row -> row.size() > 0)
    .map(row -> {
        Row realRow = new Row(row.size());
        IntStream.range(0, row.size())
                 .forEach(c -> {
                     Cell cell = row.get(c);
                     if (cell != null) {
                         realRow.setCell(c, cell);
                     }
                 });
         return realRow;
    })
    .forEach(project.rows::add);