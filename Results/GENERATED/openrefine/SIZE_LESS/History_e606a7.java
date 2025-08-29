IntStream.range(0, count)
         .forEach(i -> _futureEntries.add(HistoryEntry.load(project, reader.readLine())); 