values.forEach(value -> {
    writer.write(qid + "\t");
    writer.write(prefix);
    writer.write(value.getLanguageCode());
    writer.write("\t\"");
    writer.write(value.getText());
    writer.write("\"\n");
});