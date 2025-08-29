for (String modelName : overlayModels.keySet()) {
    writer.write("overlayModel:");
    writer.write(modelName);
    writer.write("=");
    ParsingUtilities.saveWriter.writeValue(writer, overlayModels.get(modelName));
    writer.write('\n');
}