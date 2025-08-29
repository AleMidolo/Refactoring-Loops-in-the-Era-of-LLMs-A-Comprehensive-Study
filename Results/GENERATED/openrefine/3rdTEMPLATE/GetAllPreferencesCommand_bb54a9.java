ps.getKeys().stream()
    .filter(key -> {
        Object pref = ps.get(key);
        return pref == null || pref instanceof String || pref instanceof Number || pref instanceof Boolean;
    })
    .forEach(key -> map.put(key, ps.get(key));