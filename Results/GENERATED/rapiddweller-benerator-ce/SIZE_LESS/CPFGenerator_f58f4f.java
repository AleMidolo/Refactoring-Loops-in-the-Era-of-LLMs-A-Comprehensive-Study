buf.append(digits.stream()
        .map(String::valueOf)
        .collect(Collectors.joining()));