formats.stream()
        .map(format -> {
            try {
                return new SimpleDateFormat(format, locale);
            } catch (IllegalArgumentException e) {
                throw new DateFormatException("Unable to parse date format " + format);
            }
        })
        .map(formatter -> parse(o1, formatter))
        .filter(date -> date != null)
        .findFirst()
        .orElse(null);