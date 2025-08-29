dbs.stream()
    .filter(db -> db.isDb() && "xy".equals(db.getName()))
    .findFirst()
    .ifPresent(db -> { return; });