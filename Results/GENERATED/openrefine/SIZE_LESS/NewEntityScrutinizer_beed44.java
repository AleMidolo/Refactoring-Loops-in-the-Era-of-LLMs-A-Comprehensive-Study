update.getAddedStatements().stream()
    .map(Statement::getMainSnak)
    .map(Snak::getPropertyId)
    .map(PropertyIdValue::getId)
    .filter(pid -> manifest.getInstanceOfPid().equals(pid) || manifest.getSubclassOfPid().equals(pid))
    .findFirst()
    .ifPresent(e -> typeFound = true);