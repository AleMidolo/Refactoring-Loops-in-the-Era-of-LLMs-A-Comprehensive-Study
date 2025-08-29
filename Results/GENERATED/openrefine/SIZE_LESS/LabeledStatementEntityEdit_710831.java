newTerms.stream()
         .forEach(otherLabel -> {
             String languageCode = otherLabel.getLanguageCode();
             currentTerms.put(languageCode, otherLabel);
             if (currentTermsIfNew.containsKey(languageCode)) {
                 currentTermsIfNew.remove(languageCode);
             }
         });