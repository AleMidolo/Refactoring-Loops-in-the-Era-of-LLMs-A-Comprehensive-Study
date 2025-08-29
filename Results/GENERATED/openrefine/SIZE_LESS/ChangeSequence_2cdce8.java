IntStream.range(0, _changes.length)
         .map(i -> _changes.length - 1 - i)
         .forEach(i -> _changes[i].revert(project));