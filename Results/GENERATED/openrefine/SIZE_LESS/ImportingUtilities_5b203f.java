normalizedLocalName = paths.stream()
    .filter(p -> !p.equals(""))
    .map(p -> currentFileSystem.toLegalFileName(p, '-'))
    .map(p -> String.format("%c%s", File.separatorChar, p))
    .collect(Collectors.joining());