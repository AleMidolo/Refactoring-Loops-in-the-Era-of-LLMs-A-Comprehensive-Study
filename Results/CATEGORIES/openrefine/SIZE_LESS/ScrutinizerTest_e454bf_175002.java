for (EntityEdit update : Arrays.asList(updates)) {
    if (!update.isNull()) {
        scrutinizer.scrutinize(update);
    }
}