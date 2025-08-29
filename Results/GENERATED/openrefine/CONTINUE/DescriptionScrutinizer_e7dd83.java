descriptions.stream()
    .map(MonolingualTextValue::getText)
    .filter(Objects::nonNull)
    .map(String::trim)
    .filter(s -> !s.isEmpty())
    .forEach(descText -> scrutinize(update, descText, description.getLanguageCode());