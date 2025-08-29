for (SystemRef db : dbs) {
    if (db.isDb() && "xy".equals(db.getName())) {
        return;
    }
}