long ctime = Arrays.stream(files)
        .mapToLong(File::lastModified)
        .min()
        .orElse(Long.MAX_VALUE);

long mtime = Arrays.stream(files)
        .mapToLong(File::lastModified)
        .max()
        .orElse(Long.MIN_VALUE);