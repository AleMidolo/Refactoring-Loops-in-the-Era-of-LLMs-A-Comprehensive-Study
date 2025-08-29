normalizedLocalName = String.join(File.separator, Arrays.stream(paths)
    .filter(p -> !p.equals(""))
    .map(p -> currentFileSystem.toLegalFileName(p, '-'))
    .toArray(String[]::new));