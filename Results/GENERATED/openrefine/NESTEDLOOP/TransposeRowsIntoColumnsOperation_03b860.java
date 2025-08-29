IntStream.range(0, columnCount)
        .forEach(i -> {
            Column column = oldColumns.get(i);
            if (i == columnIndex) {
                AtomicInteger newIndex = new AtomicInteger(1);
                IntStream.range(0, _rowCount)
                        .mapToObj(n -> {
                            String columnName = _columnName + " " + newIndex.getAndIncrement();
                            while (project.columnModel.getColumnByName(columnName) != null) {
                                columnName = _columnName + " " + newIndex.getAndIncrement();
                            }
                            return new Column(i + n, columnName);
                        })
                        .forEach(newColumns::add);
            } else if (i < columnIndex) {
                newColumns.add(new Column(i, column.getName()));
            } else {
                newColumns.add(new Column(i + _rowCount - 1, column.getName()));
            }
        });