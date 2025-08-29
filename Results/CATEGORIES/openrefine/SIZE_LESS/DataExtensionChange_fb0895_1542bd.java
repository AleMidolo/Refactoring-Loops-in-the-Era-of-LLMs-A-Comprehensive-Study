for (ReconType type : _columnTypes) {
    if (type != null) {
        ParsingUtilities.defaultWriter.writeValue(writer, type);
    }
    writer.write('\n');
}