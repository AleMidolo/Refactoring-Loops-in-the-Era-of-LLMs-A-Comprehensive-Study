Date date = IntStream.range(0, formats.size())
    .mapToObj(i -> {
        try {
            formatter = new SimpleDateFormat(formats.get(i), locale);
            return parse(o1, formatter);
        } catch (IllegalArgumentException e) {
            throw new DateFormatException("Unable to parse date format " + formats.get(i));
        }
    })
    .filter(Objects::nonNull)
    .findFirst()
    .orElse(null);