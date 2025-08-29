words.stream()
     .filter(word -> !s_stopWords.contains(word))
     .forEach(set::add);