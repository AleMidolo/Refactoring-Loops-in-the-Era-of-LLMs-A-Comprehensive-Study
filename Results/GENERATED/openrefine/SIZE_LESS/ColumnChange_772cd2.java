IntStream.range(0, oldColumnGroupCount)
    .mapToObj(i -> reader.readLine())
    .filter(Objects::nonNull)
    .map(ColumnGroup::load)
    .forEach(oldColumnGroups::add);