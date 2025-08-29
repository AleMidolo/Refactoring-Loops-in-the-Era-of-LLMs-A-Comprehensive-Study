list.forEach(strings -> {
    IntStream.range(0, 4).forEach(col -> {
        String text = strings[col];
        if (col > 0) {
            pad(widths[col] - text.length(), result);
            result.append(text);
        } else {
            result.append(text);
            pad(widths[col] - text.length(), result);
        }
        if (col < 3)
            result.append(' ');
    });
    result.append(SystemInfo.LF);
});