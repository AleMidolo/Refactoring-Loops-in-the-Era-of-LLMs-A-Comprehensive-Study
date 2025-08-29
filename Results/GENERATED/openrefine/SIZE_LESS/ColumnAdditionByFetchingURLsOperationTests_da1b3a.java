IntStream.range(0, 3)
         .mapToObj(i -> {
             Row row = new Row(2);
             row.setCell(0, new Cell("test" + (i + 1), null));
             return row;
         })
         .forEach(project.rows::add);