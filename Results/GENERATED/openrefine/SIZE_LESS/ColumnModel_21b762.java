IntStream.range(0, count)
    .mapToObj(i -> ColumnGroup.load(reader.readLine()))
    .forEach(columnGroups::add);