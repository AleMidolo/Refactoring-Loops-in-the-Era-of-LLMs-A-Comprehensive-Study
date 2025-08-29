

Optional<Date> result = formats.stream()
        .map(format -> {
            try {
                formatter = new SimpleDateFormat(format, locale);
            } catch (IllegalArgumentException e) {
                throw new DateFormatException("Unable to parse date format " + format);
            }
            return parse(o1, formatter);
        })
        .filter(date -> date != null)
        .findFirst();