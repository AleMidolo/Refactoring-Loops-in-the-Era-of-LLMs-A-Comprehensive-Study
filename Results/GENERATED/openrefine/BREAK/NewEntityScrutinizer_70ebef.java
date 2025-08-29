update.getAddedStatements().stream()
    .map(Statement::getMainSnak)
    .map(Snak::getPropertyId)
    .map(PropertyIdValue::getId)
    .anyMatch(pid -> manifest.getInstanceOfPid().equals(pid) || manifest.getSubclassOfPid().equals(pid));