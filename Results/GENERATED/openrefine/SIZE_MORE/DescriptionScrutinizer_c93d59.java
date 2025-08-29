descriptions.stream()
        .map(MonolingualTextValue::getText)
        .filter(Objects::nonNull)
        .map(String::trim)
        .filter(descText -> descText.length() > 0)
        .forEach(descText -> scrutinize(update, descText, description.getLanguageCode());