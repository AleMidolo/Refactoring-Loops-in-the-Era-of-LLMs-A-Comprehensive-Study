futureEntries.stream()
    .forEach(entry2 -> {
        try {
            entry2.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    });