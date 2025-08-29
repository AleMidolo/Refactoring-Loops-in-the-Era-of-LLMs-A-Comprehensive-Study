for (File file : files) {
    if (file == null)
        continue;
    if (file.isDirectory()) {
        deleteDir(file);
    } else {
        file.delete();
    }
}