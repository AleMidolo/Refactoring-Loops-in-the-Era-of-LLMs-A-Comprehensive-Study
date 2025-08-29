for (File f : files) {
    long time = f.lastModified();
    ctime = Math.min(ctime, time);
    mtime = Math.max(mtime, time);
}