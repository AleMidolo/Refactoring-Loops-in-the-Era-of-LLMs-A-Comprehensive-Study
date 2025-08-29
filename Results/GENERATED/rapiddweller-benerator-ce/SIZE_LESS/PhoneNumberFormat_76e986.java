IntStream.range(start, source.length())
        .takeWhile(end -> Character.isDigit(source.charAt(end)))
        .forEach(end -> {});