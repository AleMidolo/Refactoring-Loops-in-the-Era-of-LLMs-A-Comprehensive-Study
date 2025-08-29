for (String[] mapping : mappings) {
    if (mapping[0].length() == 0 || name.endsWith(mapping[0])) {
        return name.substring(0, name.length() - mapping[0].length()) + mapping[1];
    }
}