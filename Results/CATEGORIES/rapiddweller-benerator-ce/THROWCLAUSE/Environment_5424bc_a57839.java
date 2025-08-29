for (Map.Entry<String, Map<String, String>> nameEntry : nameMap.entrySet()) {
    String name = nameEntry.getKey();
    Map<String, Map<String, String>> typesMap = CollectionUtil.stripOffPrefixes(nameEntry.getValue());
    if (typesMap.size() > 1) {
        throw BeneratorExceptionFactory.getInstance().configurationError("Invalid environment definition: There are different system types " + typesMap.keySet() + "assigned to the same system name '" + name + "' in '" + envName + "' environment");
    }
    Map.Entry<String, Map<String, String>> typeEntry = typesMap.entrySet().iterator().next();
    String type = typeEntry.getKey();
    if (type.isEmpty()) {
        result.settings.put(name, properties.get(name));
    } else {
        Map<String, String> sysProps = typeEntry.getValue();
        result.systems.put(name, new SystemRef(result, name, type, sysProps));
    }
}