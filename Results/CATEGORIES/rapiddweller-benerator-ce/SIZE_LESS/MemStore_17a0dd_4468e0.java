for (Map.Entry<String, EntityStore> typeEntry : entitiesByType.entrySet()) {
    printer.printStd(typeEntry.getKey() + ':');
    int index = 0;
    for (Entity entity : typeEntry.getValue()) {
        printer.printStd(index++ + ": " + entity);
    }
}