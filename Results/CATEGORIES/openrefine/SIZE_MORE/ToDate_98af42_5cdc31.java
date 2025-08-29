for (int i = 0; i < formats.size(); i++) {
    try {
        formatter = new SimpleDateFormat(formats.get(i), locale);
    } catch (IllegalArgumentException e) {
        throw new DateFormatException("Unable to parse date format " + formats.get(i));
    }
    date = parse(o1, formatter);
    if (date != null) {
        return date;
    }
}