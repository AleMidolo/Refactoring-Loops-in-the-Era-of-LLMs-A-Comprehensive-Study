for (String tag : tags) {
    if (_projectsTags.containsKey(tag)) {
        int occurrence = _projectsTags.get(tag);
        if (occurrence <= 1)
            _projectsTags.remove(tag);
        else {
            _projectsTags.put(tag, occurrence - 1);
        }
    }
}