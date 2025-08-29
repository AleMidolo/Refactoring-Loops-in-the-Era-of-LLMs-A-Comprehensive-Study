exceptions.stream()
    .map(e -> {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        ObjectNode o = ParsingUtilities.mapper.createObjectNode();
        JSONUtilities.safePut(o, "message", e.getLocalizedMessage());
        JSONUtilities.safePut(o, "stack", sw.toString());
        return o;
    })
    .forEach(a::add);