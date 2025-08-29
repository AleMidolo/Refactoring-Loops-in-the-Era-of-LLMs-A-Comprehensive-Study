setup.getFiles().stream()
        .filter(file -> StringUtil.isEmpty(System.getProperty(file)))
        .forEach(file -> {
            throw BeneratorExceptionFactory.getInstance().configurationError("No concrete file specified for file variable " + file);
        });