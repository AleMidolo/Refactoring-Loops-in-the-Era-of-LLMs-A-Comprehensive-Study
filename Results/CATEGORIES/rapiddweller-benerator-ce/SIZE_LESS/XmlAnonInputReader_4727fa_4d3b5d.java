for (String file : setup.getFiles()) {
    if (StringUtil.isEmpty(System.getProperty(file))) {
        throw BeneratorExceptionFactory.getInstance().configurationError("No concrete file specified for file variable " + file);
    }
}