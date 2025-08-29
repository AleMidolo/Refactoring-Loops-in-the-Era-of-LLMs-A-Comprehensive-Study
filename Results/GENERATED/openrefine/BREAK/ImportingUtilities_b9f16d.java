List<String> extensions = Arrays.asList(".gz", ".bz2");
fileName = extensions.stream()
    .filter(ext -> fileName.endsWith(ext))
    .map(ext -> fileName.substring(0, fileName.length() - ext.length()))
    .findFirst()
    .orElse(fileName);