for (Statement statement : update.getAddedStatements()) {
    String pid = statement.getMainSnak().getPropertyId().getId();
    if (manifest.getInstanceOfPid().equals(pid) || manifest.getSubclassOfPid().equals(pid)) {
        typeFound = true;
        break;
    }
}