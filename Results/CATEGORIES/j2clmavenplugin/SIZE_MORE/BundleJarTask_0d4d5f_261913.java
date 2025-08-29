for (Iterator<Input> iterator = remaining.iterator(); iterator.hasNext(); ) {
    Input input = iterator.next();
    if (input.getProject().getDependencies().stream().noneMatch(dep -> pendingProjectKeys.contains(dep.getProject().getKey()))) {
        iterator.remove();
        pendingProjectKeys.remove(input.getProject().getKey());
        sourceOrder.add(input);
    }
}