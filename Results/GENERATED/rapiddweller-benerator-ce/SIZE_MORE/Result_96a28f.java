columns.stream()
        .forEach(column -> {
            if (index > 0) {
                csvWriter.print(separator);
            }
            Object value = entity.getComponent(column);
            StringBuilder out = (value == null) ? new StringBuilder() : new StringBuilder(plainConverter.convert(value));
            if (out.length() == 0) {
                out = new StringBuilder("\"\"");
            } else if (out.toString().contains(separator)) {
                out = new StringBuilder('"' + out.toString() + '"');
            }
            csvWriter.print(out.toString().replace("\n", "\t"));
            csvWriter.flush();
            index++;
        });