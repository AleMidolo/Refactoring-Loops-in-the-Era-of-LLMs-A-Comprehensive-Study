descriptions.stream()
    .map(MonolingualTextValue::getText)
    .filter(Objects::nonNull)
    .map(String::trim)
    .filter(text -> text.length() > 0)
    .forEach(text -> scrutinize(update, text, text.getLanguageCode());