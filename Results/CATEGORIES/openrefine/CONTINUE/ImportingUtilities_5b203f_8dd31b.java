for (String p : paths) {
    if (p.equals("")) {
        continue;
    }
    p = currentFileSystem.toLegalFileName(p, '-');
    normalizedLocalName += String.format("%c%s", File.separatorChar, p);
}