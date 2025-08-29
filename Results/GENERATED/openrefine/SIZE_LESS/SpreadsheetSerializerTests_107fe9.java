IntStream.range(0, 30)
    .mapToObj(i -> {
        String colnum = Integer.toString(i);
        return new CellData("col" + colnum, "text" + colnum, "text" + colnum, null);
    })
    .forEach(cells::add);