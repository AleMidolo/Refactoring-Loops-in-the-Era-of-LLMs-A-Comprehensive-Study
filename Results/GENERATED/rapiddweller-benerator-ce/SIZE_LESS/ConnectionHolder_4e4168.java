descriptor.getIdComponentNames().stream()
    .map(idColumnName -> " " + idColumnName + "=?")
    .forEach(builder::append);