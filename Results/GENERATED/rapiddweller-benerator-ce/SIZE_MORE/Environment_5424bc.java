nameMap.entrySet().stream()
    .map(nameEntry -> {
        String name = nameEntry.getKey();
        Map<String, Map<String, String>> typesMap = CollectionUtil.stripOffPrefixes(nameEntry.getValue());
        if (typesMap.size() > 1) {
            throw BeneratorExceptionFactory.getInstance().configurationError("Invalid environment definition: There are different system types " + typesMap.keySet() + "assigned to the same system name '" + name + "' in '" + envName + "' environment");
        }
        return typesMap.entrySet().iterator().next();
    })
    .forEach(typeEntry -> {
        String name = typeEntry.getKey();
        if (name.isEmpty()) {
            result.settings.put(name, properties.get(name));
        } else {
            Map<String, String> sysProps = typeEntry.getValue();
            result.systems.put(name, new SystemRef(result, name, name, sysProps));
        }
    });