exceptions.stream()
            .map(e -> {
                StringWriter sw = new StringWriter();
                e.printStackTrace(new PrintWriter(sw));
                return new AbstractMap.SimpleEntry<>(e.getLocalizedMessage(), sw.toString());
            })
            .forEach(entry -> {
                writer.writeStartObject();
                writer.writeStringField("message", entry.getKey());
                writer.writeStringField("stack", entry.getValue());
                writer.writeEndObject();
            });