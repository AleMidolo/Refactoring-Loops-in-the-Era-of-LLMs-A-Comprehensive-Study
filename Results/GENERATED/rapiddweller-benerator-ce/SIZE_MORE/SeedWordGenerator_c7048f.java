nouns.stream()
     .peek(noun -> {
         if (noun.getSingular() != null) {
             words.add(noun.getSingular());
         }
     })
     .forEach(noun -> {
         if (noun.getPlural() != null) {
             words.add(noun.getPlural());
         }
     });