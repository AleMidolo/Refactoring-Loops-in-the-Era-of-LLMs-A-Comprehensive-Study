tokens.stream()
    .map(token -> StringUtil.splitOnFirstSeparator(token, '#'))
    .forEach(parts -> {
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
            environment.getSystems().forEach(sysBuilder::add);
        }
    });