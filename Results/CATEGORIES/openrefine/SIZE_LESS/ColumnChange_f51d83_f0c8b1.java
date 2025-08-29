for (ColumnGroup cg : oldColumnGroups) {
    ParsingUtilities.saveWriter.writeValue(writer, cg);
    writer.write('\n');
}