elements.entrySet().stream()
    .filter(entry -> !entry.getKey().equals("id"))
    .forEach(entry -> builder.append(String.format("%s.db.%s=%s\n", DBMS, entry.getKey(), entry.getValue())));