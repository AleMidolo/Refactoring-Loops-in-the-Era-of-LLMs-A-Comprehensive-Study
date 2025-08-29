dbs.stream()
   .map(system -> "- " + EnvironmentUtil.getDbProductDescription(system))
   .forEach(builder::add);