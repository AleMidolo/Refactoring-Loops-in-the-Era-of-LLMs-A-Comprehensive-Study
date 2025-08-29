for (DependencyInfoAndSource info : sorter.getSortedList()) {
    String code = info.getSource();
    String name = info.getName();
    if (Compiler.isFillFileName(name) && code.isEmpty()) {
        continue;
    }
    bundleOut.append("//").append(name).append("\n");
    bundler.withPath(name).withSourceUrl(Closure.SOURCES_DIRECTORY_NAME + "/" + name).appendTo(bundleOut, info, code);
    bundleOut.append("\n");
}