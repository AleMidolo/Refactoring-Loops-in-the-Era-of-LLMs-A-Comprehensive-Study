result.append(Arrays.stream(cells)
    .map(cell -> cell == null ? "null" : cell.toString())
    .collect(Collectors.joining(",")));