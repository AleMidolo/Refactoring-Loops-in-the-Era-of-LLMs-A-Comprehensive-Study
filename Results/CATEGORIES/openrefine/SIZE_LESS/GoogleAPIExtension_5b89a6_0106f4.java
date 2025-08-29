for (String part : parts) {
    if (part.startsWith(key + "=")) {
        int offset = key.length() + 1;
        String tableId = part.substring(offset);
        return tableId;
    }
}