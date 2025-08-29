for (String token : tokens) {
    String[] parts = StringUtil.splitOnFirstSeparator(token, '#');
    String envName = parts[0];
    if ("builtin".equals(envName)) {
        String envFileName = EnvironmentUtil.fileName(envName);
        IOUtil.copyFile(BenchmarkRunner.RESOURCE_FOLDER + "/" + envFileName, envFileName);
    }
    Environment environment = EnvironmentUtil.parse(envName, ".");
    String sysSpec = parts[1];
    if (sysSpec != null) {
        sysBuilder.add(environment.getSystem(sysSpec));
    } else {
        for (SystemRef system : environment.getSystems()) {
            sysBuilder.add(system);
        }
    }
}