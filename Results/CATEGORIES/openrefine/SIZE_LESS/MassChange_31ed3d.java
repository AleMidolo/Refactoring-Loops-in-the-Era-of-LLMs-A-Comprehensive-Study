for (Change change : Lists.reverse(_changes)) {
    change.revert(project);
}