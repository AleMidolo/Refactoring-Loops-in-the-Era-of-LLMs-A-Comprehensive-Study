overlayModels.keySet().stream()
    .forEach(modelName -> {
        writer.write("overlayModel:");
        writer.write(modelName);
        writer.write("=");
        ParsingUtilities.saveWriter.writeValue(writer, overlayModels.get(modelName));
        writer.write('\n');
    });