for (String tag : tags) {
    if (_projectsTags.containsKey(tag)) {
        _projectsTags.put(tag, _projectsTags.get(tag) + 1);
    } else {
        _projectsTags.put(tag, 1);
    }
}