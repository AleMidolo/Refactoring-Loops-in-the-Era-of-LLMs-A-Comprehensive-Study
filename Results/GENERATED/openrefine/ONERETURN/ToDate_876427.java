return formats.stream()
    .map(f -> {
        try {
            return new SimpleDateFormat(f, locale);
        } catch (IllegalArgumentException e) {
            throw new DateFormatException("Unable to parse date format " + f);
        }
    })
    .map(formatter -> parse(o1, formatter))
    .filter(date -> date != null)
    .findFirst()
    .orElse(null);