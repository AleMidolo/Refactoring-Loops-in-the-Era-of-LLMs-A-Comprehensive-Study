for (EntityEdit update : mergedUpdates) {
    if (!update.isNull()) {
        for (EditScrutinizer scrutinizer : scrutinizers.values()) {
            scrutinizer.scrutinize(update);
        }
    }
}