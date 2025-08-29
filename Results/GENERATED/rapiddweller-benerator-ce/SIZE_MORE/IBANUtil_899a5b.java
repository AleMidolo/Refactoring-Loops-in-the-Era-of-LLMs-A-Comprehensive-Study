tmp.chars()
    .mapToObj(c -> (char) c)
    .filter(c -> (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z'))
    .forEach(c -> {
        if (c >= '0' && c <= '9') {
            digits.append(c);
        } else {
            int n = c - 'A' + 10;
            digits.append((char) ('0' + n / 10));
            digits.append((char) ('0' + (n % 10)));
        }
    });