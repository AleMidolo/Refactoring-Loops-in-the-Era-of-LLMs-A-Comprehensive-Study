IntStream.range(0, count)
         .mapToObj(i -> HistoryEntry.load(project, reader.readLine()))
         .forEach(_futureEntries::add);