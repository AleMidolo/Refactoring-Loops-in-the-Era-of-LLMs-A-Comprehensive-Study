for (int i = resources.size() - 1; i >= 0; i--) {
    Closeable resource = resources.get(i);
    if (!(resource instanceof ConsumerChain)) {
        IOUtil.close(resource);
    }
}