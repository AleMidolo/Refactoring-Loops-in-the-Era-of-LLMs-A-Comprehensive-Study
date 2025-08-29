IntStream.range(0, noOfRows)
        .forEach(i -> {
            Row row = new Row(noOfColumns);
            IntStream.range(0, noOfColumns)
                    .forEach(j -> row.cells.add(new Cell(now, null)));
            project.rows.add(row);
        });