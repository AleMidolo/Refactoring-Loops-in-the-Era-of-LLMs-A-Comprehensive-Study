for (Exception e : exceptions) {
    StringWriter sw = new StringWriter();
    e.printStackTrace(new PrintWriter(sw));
    writer.writeStartObject();
    writer.writeStringField("message", e.getLocalizedMessage());
    writer.writeStringField("stack", sw.toString());
    writer.writeEndObject();
}