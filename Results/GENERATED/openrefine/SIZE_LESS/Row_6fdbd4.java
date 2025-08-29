result.append(cells.stream()
        .map(cell -> cell == null ? "null" : cell.toString())
        .collect(Collectors.joining(",")));