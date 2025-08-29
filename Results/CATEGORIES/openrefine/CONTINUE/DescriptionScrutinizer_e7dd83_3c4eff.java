for (MonolingualTextValue description : descriptions) {
    String descText = description.getText();
    if (descText == null) {
        continue;
    }
    descText = descText.trim();
    if (descText.length() == 0) {
        continue;
    }
    scrutinize(update, descText, description.getLanguageCode());
}