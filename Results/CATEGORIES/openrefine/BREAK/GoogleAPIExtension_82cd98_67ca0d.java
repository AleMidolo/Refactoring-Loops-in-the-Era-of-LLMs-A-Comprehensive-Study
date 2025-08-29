for (String part : parts) {
    if (part.startsWith("id=")) {
        offset = ("id=").length();
        keyOrId = part.substring(offset);
        numParts = 4;
        break;
    } else if (part.startsWith("key=")) {
        offset = ("key=").length();
        keyOrId = part.substring(offset);
        if (!keyOrId.isEmpty()) {
            return keyOrId;
        }
        numParts = 2;
        break;
    }
}