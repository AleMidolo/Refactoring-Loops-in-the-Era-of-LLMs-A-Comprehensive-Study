sorter.getSortedList().stream()
        .filter(info -> !(Compiler.isFillFileName(info.getName()) && info.getSource().isEmpty()))
        .forEach(info -> {
            String code = info.getSource();
            String name = info.getName();
            bundleOut.append("//").append(name).append("\n");
            bundler.withPath(name).withSourceUrl(Closure.SOURCES_DIRECTORY_NAME + "/" + name).appendTo(bundleOut, info, code);
            bundleOut.append("\n");
        });