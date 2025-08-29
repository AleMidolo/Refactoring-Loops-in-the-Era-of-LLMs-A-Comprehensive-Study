for (Recon recon : recons2) {
    ParsingUtilities.saveWriter.writeValue(writer, recon);
    writer.write('\n');
}