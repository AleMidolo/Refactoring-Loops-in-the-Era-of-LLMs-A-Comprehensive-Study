oldColumns.stream()
        .filter(i -> i != keyColumnIndex && i != valueColumnIndex && i != noteColumnIndex)
        .forEach(i -> unchangedColumns.add(oldColumns.get(i));