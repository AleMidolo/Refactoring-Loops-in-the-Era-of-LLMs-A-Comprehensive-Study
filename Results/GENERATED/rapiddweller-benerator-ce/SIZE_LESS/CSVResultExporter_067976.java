formatInfo(result).stream()
    .forEach(info -> writer.writeRow(new Object[] { info }));