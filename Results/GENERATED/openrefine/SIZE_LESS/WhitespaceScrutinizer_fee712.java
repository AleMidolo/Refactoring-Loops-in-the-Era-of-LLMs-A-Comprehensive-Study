_issuesMap.entrySet().stream()
    .filter(entry -> entry.getValue().matcher(str).find())
    .forEach(entry -> emitWarning(entry.getKey(), str));