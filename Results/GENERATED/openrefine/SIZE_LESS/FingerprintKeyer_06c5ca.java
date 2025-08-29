IntStream.range(0, orig.length())
        .mapToObj(i -> orig.substring(i, i + 1))
        .map(source -> NONDIACRITICS.get(source))
        .forEach(replace -> result.append(replace == null ? replace : replace));