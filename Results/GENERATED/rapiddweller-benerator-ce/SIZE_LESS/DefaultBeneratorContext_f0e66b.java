Arrays.stream(Objects.requireNonNull(libFolder.listFiles(new FileSuffixFilter("jar", false)))
        .forEach(jarFile -> {
            ClassLoader classLoader = BeanUtil.createJarClassLoader(jarFile);
            Thread.currentThread().setContextClassLoader(classLoader);
        });