for (Entity entity : entities) {
    Object component = entity.get(componentName);
    if (matcher.accept(component)) {
        matchCount++;
    }
}