for (HistoryEntry entry2 : futureEntries) {
    try {
        entry2.delete();
    } catch (Exception e) {
        e.printStackTrace();
    }
}