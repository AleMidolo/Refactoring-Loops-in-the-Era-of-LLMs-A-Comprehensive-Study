IntStream.range(0, oldCellCount)
    .forEach(i -> {
        try {
            line = reader.readLine();
            if (line != null) {
                oldCells[i] = CellAtRow.load(line, pool);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    });