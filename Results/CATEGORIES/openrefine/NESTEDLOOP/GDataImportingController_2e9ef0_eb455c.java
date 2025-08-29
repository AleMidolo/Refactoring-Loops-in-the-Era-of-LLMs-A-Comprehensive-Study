for (File entry : fileList.getFiles()) {
    writer.writeStartObject();
    writer.writeStringField("docId", entry.getId());
    writer.writeStringField("docLink", entry.getWebViewLink());
    writer.writeStringField("docSelfLink", entry.getWebViewLink());
    writer.writeStringField("title", entry.getName());
    writer.writeStringField("type", "spreadsheet");
    com.google.api.client.util.DateTime updated = entry.getModifiedTime();
    if (updated != null) {
        writer.writeStringField("updated", updated.toString());
    }
    writer.writeArrayFieldStart("authors");
    for (User user : entry.getOwners()) {
        writer.writeString(user.getDisplayName());
    }
    writer.writeEndArray();
    writer.writeEndObject();
}