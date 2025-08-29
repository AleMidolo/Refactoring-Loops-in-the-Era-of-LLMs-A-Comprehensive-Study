for (File file : files) {
    if (file == null)
        continue;
    if (!file.isHidden()) {
        String path = relative + file.getName();
        if (file.isDirectory()) {
            tarDir(path + File.separator, file, tos);
        } else {
            TarArchiveEntry entry = new TarArchiveEntry(path);
            entry.setMode(TarArchiveEntry.DEFAULT_FILE_MODE);
            entry.setSize(file.length());
            entry.setModTime(file.lastModified());
            tos.putArchiveEntry(entry);
            copyFile(file, tos);
            tos.closeArchiveEntry();
        }
    }
}