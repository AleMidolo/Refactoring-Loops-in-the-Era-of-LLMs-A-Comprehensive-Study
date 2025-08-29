envFiles.stream()
        .map(File::getName)
        .map(envFileName -> envFileName.substring(0, envFileName.indexOf(ENV_FILE_SUFFIX)))
        .forEach(envName -> result.computeIfAbsent(envName, k -> parseFile(envName, envFiles.getAbsolutePath()));