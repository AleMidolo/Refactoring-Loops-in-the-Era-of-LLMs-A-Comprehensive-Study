for (MonolingualTextValue otherLabel : newTerms) {
    String languageCode = otherLabel.getLanguageCode();
    currentTerms.put(languageCode, otherLabel);
    if (currentTermsIfNew.containsKey(languageCode)) {
        currentTermsIfNew.remove(languageCode);
    }
}