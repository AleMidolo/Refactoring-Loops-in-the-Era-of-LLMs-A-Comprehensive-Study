for (Noun noun : nouns) {
    if (noun.getSingular() != null) {
        words.add(noun.getSingular());
    }
    if (noun.getPlural() != null) {
        words.add(noun.getPlural());
    }
}