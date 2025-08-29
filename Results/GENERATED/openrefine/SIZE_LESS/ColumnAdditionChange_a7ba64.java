IntStream.range(0, newCellCount)
    .mapToObj(i -> {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    })
    .filter(Objects::nonNull)
    .map(line -> CellAtRow.load(line, pool))
    .forEach(newCells::add);