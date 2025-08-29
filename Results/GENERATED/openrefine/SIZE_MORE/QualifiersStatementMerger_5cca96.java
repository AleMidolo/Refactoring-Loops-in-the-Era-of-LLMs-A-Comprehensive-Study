added.getQualifiers().stream()
    .map(SnakGroup::getProperty)
    .filter(pid -> !pids.contains(pid.getId()))
    .forEach(addedSnakGroup -> {
        OptionalInt index = IntStream.range(0, finalQualifiers.size())
            .filter(i -> finalQualifiers.get(i).getProperty().getId().equals(addedSnakGroup.getProperty().getId()))
            .findFirst();
        if (index.isEmpty()) {
            finalQualifiers.add(addedSnakGroup);
        } else {
            finalQualifiers.set(index.getAsInt(), mergeSnakGroups(finalQualifiers.get(index.getAsInt()), addedSnakGroup));
        }
    });