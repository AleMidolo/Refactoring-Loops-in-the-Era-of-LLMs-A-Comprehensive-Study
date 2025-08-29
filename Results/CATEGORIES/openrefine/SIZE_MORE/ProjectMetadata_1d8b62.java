for (String tag : tags) {
    if (tag != null) {
        String trimmedTag = CharMatcher.whitespace().trimFrom(tag);
        if (!trimmedTag.isEmpty()) {
            tmpTags.add(trimmedTag);
        }
    }
}