project.columnModel.columns.stream()
    .forEach(column -> {
        writer.writeStartObject();
        write(project, column, writer);
        writer.writeEndObject();
    });