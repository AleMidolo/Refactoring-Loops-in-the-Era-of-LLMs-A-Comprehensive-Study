components.stream()
    .forEach(entry -> {
        if (first) {
            first = false;
        } else {
            builder.append(", ");
        }
        columnName = entry.getKey();
        if (this.quoteTableNames) {
            builder.append('"');
        }
        builder.append(columnName);
        if (this.quoteTableNames) {
            builder.append('"');
        }
    });