tags.stream()
     .filter(tag -> _projectsTags.containsKey(tag))
     .forEach(tag -> _projectsTags.put(tag, _projectsTags.get(tag) + 1));

tags.stream()
     .filter(tag -> !_projectsTags.containsKey(tag))
     .forEach(tag -> _projectsTags.put(tag, 1));