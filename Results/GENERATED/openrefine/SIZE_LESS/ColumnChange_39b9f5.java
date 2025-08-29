IntStream.range(0, oldColumnGroupCount)
    .mapToObj(i -> {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    })
    .filter(Objects::nonNull)
    .map(ColumnGroup::load)
    .forEach(oldColumnGroups::add);