for (Map.Entry entry : ((Set<Map.Entry>) map.entrySet())) {
    entity.setComponent((String) entry.getKey(), entry.getValue());
}