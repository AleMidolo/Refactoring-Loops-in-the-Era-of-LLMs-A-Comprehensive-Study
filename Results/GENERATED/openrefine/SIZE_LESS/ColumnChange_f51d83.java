oldColumnGroups.forEach(cg -> {
    ParsingUtilities.saveWriter.writeValue(writer, cg);
    writer.write('\n');
});