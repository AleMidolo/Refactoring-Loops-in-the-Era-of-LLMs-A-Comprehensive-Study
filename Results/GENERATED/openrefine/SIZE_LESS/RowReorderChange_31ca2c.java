List<Row> newRows = _rowIndices.stream()
                                 .map(oldRows::get)
                                 .collect(Collectors.toList());