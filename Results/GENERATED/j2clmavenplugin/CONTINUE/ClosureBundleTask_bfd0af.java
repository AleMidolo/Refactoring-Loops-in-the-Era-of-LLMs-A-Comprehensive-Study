sorter.getSortedList().stream()
        .filter(info -> !(Compiler.isFillFileName(info.getName()) && info.getSource().isEmpty()))
        .forEach(info -> {
            bundleOut.append("//").append(info.getName()).append("\n");
            bundler.withPath(info.getName()).withSourceUrl(Closure.SOURCES_DIRECTORY_NAME + "/" + info.getName()).appendTo(bundleOut, info, info.getSource());
            bundleOut.append("\n");
        });