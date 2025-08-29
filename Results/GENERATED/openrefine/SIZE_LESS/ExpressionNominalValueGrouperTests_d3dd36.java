IntStream.range(0, numberOfRows)
         .forEach(i -> {
             Row row = new Row(1);
             row.setCell(0, new Cell(dateTimeValue, null));
             project.rows.add(row);
         });