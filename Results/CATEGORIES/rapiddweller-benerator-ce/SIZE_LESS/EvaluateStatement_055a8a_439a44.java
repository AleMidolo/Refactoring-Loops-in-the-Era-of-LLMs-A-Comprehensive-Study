for (Entry<String, String> entry : extensionMap.entrySet()) {
    if (lcUri.endsWith(entry.getKey())) {
        return entry.getValue();
    }
}