Arrays.stream(paths)
        .filter(p -> !p.equals(""))
        .map(p -> currentFileSystem.toLegalFileName(p, '-'))
        .forEach(p -> normalizedLocalName += String.format("%c%s", File.separatorChar, p));