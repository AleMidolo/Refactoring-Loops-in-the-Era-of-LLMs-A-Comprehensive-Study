a.stream()
    .filter(obj -> obj instanceof ObjectNode)
    .map(obj -> (ObjectNode) obj)
    .forEach(obj -> reconstructOperation(project, obj));