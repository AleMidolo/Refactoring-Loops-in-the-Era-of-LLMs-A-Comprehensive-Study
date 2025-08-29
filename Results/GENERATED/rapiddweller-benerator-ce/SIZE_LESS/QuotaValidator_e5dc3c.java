int matchCount = (int) collection.stream()
                               .filter(filter::accept)
                               .count();