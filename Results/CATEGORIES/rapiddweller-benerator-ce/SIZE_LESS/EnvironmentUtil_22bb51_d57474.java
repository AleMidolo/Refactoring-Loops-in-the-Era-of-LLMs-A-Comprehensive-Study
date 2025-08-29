for (File envFile : envFiles) {
    String envFileName = envFile.getName();
    String envName = envFileName.substring(0, envFileName.indexOf(ENV_FILE_SUFFIX));
    result.computeIfAbsent(envName, k -> parseFile(envName, envFile.getAbsolutePath()));
}