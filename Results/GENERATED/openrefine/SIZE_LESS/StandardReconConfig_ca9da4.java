shortWords.stream()
            .filter(longWords::contains)
            .forEach(word -> common++);