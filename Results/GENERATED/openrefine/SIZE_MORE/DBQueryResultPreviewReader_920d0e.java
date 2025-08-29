rowOfCells.addAll(IntStream.range(0, Math.min(row.size(), dbColumns.size()))
        .mapToObj(j -> {
            String text = row.get(j);
            if (text == null || text.isEmpty()) {
                return null;
            }
            DatabaseColumn col = dbColumns.get(j);
            if (col.getType() == DatabaseColumnType.NUMBER) {
                try {
                    return Long.parseLong(text);
                } catch (NumberFormatException e) {
                    return null;
                }
            } else if (col.getType() == DatabaseColumnType.DOUBLE || col.getType() == DatabaseColumnType.FLOAT) {
                try {
                    double d = Double.parseDouble(text);
                    if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                        return d;
                    }
                } catch (NumberFormatException e) {
                    return null;
                }
            }
            return text;
        })
        .forEach(rowOfCells::add);