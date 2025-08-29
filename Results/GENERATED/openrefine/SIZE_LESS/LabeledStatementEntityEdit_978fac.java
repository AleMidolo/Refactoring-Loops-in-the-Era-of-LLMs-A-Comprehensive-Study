newTerms.stream()
        .forEach(otherLabel -> {
            String languageCode = otherLabel.getLanguageCode();
            currentTerms.put(languageCode, otherLabel);
            currentTermsIfNew.remove(languageCode);
        });