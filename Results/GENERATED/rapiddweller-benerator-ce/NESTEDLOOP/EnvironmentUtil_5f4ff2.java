ConfigUtil.defaultConfigLocations(projectFolder).stream()
    .map(File::new)
    .filter(File::exists)
    .flatMap(folder -> Arrays.stream(folder.listFiles((dir, name) -> name.toLowerCase().endsWith(ENV_FILE_SUFFIX)))
    .filter(Objects::nonNull)
    .forEach(envFile -> {
        String envFileName = envFile.getName();
        String envName = envFileName.substring(0, envFileName.indexOf(ENV_FILE_SUFFIX));
        result.computeIfAbsent(envName, k -> parseFile(envName, envFile.getAbsolutePath()));
    });