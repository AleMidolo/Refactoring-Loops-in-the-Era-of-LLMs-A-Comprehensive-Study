for (SnakGroup addedSnakGroup : added.getQualifiers()) {
    PropertyIdValue pid = addedSnakGroup.getProperty();
    if (!pids.contains(pid.getId())) {
        OptionalInt index = IntStream.range(0, finalQualifiers.size()).filter(i -> finalQualifiers.get(i).getProperty().getId().equals(pid.getId())).findFirst();
        if (index.isEmpty()) {
            finalQualifiers.add(addedSnakGroup);
        } else {
            finalQualifiers.set(index.getAsInt(), mergeSnakGroups(finalQualifiers.get(index.getAsInt()), addedSnakGroup));
        }
    }
}