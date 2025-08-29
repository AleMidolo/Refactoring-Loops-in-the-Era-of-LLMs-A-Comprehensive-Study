_columnTypes.stream()
            .filter(Objects::nonNull)
            .forEach(type -> {
                ParsingUtilities.defaultWriter.writeValue(writer, type);
                writer.write('\n');
            });