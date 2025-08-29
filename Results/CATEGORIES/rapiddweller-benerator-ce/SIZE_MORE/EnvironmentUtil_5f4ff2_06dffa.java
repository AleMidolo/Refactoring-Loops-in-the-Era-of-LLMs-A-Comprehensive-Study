for (String location : ConfigUtil.defaultConfigLocations(projectFolder)) {
    File folder = new File(location);
    if (folder.exists()) {
        File[] envFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(ENV_FILE_SUFFIX));
        if (envFiles != null) {
            for (File envFile : envFiles) {
                String envFileName = envFile.getName();
                String envName = envFileName.substring(0, envFileName.indexOf(ENV_FILE_SUFFIX));
                result.computeIfAbsent(envName, k -> parseFile(envName, envFile.getAbsolutePath()));
            }
        }
    }
}