for (String arg : args) {
    if (arg.startsWith("-D")) {
        String[] tokens = StringUtil.splitOnFirstSeparator(arg.substring(2), '=');
        if (tokens.length == 2) {
            System.setProperty(tokens[0], tokens[1]);
        }
    } else {
        params.add(arg);
    }
}