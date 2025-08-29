tags.stream()
    .filter(tag -> _projectsTags.containsKey(tag))
    .forEach(tag -> {
        int occurrence = _projectsTags.get(tag);
        if (occurrence <= 1)
             _projectsTags.remove(tag);
        else
             _projectsTags.put(tag, occurrence - 1);
    });