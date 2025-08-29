for (String key : ps.getKeys()) {
    Object pref = ps.get(key);
    if (pref == null || pref instanceof String || pref instanceof Number || pref instanceof Boolean) {
        map.put(key, pref);
    }
}