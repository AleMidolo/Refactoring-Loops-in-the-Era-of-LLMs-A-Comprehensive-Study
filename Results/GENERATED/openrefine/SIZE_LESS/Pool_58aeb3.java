recons2.stream()
        .forEach(recon -> {
            ParsingUtilities.saveWriter.writeValue(writer, recon);
            writer.write('\n');
        });