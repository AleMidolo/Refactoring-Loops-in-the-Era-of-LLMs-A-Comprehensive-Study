for (File jarFile : Objects.requireNonNull(libFolder.listFiles(new FileSuffixFilter("jar", false)))) {
    ClassLoader classLoader = BeanUtil.createJarClassLoader(jarFile);
    Thread.currentThread().setContextClassLoader(classLoader);
}