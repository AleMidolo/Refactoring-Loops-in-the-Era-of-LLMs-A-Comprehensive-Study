tags.stream()
    .forEach(tag -> _projectsTags.put(tag, _projectsTags.getOrDefault(tag, 0) + 1));