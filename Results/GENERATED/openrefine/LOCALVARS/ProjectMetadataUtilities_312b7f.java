long ctime = Arrays.stream(files)
        .mapToLong(File::lastModified)
        .min()
        .orElse(0);

long mtime = Arrays.stream(files)
        .mapToLong(File::lastModified)
        .max()
        .orElse(0);