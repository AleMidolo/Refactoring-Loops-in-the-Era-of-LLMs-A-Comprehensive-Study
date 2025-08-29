int width = list.stream()
        .map(strings -> strings[col].length())
        .max(Integer::compareTo)
        .orElse(0);