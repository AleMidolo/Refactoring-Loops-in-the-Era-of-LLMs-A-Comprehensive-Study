IntStream.range(0, linesPerRow)
    .filter(i -> lnReader.hasNext())
    .mapToObj(i -> lnReader.next())
    .peek(line -> {
        if (i == 0) {
            cells = new ArrayList<>(linesPerRow);
        }
        cells.add(line);
    })
    .findFirst();