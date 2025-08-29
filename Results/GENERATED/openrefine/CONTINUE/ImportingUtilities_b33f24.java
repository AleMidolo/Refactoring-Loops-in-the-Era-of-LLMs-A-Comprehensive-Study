normalizedLocalName = paths.stream()
                            .filter(p -> !p.equals(""))
                            .map(p -> currentFileSystem.toLegalFileName(p, '-'))
                            .collect(Collectors.joining(String.format("%c", File.separatorChar)));