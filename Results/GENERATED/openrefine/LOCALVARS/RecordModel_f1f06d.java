IntStream.range(1, rowCount)
         .mapToObj(r -> _rowDependencies.get(r))
         .filter(rd -> rd.recordIndex >= 0)
         .forEach(rd -> {
             _records.add(new Record(recordRowIndex, r, recordIndex++));
             recordIndex = rd.recordIndex;
             recordRowIndex = r;
         });