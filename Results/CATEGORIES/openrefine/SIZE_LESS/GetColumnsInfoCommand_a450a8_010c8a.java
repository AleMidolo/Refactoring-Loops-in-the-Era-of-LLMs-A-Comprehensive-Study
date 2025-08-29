for (Column column : project.columnModel.columns) {
    writer.writeStartObject();
    write(project, column, writer);
    writer.writeEndObject();
}