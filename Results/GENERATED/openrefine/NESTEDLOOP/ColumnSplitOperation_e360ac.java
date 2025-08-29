IntStream.range(columnNames.size(), tuple.size())
        .forEach(i -> {
            IntStream.iterate(columnNameIndex, n -> n + 1)
                    .mapToObj(index -> _columnName + " " + index)
                    .filter(newColumnName -> project.columnModel.getColumnByName(newColumnName) == null)
                    .findFirst()
                    .ifPresent(columnNames::add);
        });