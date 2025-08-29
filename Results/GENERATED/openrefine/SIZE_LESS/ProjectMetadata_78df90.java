_userMetadata.stream()
        .filter(obj -> obj.get("name").asText("").equals(metaName))
        .forEach(obj -> obj.put("value", valueString));