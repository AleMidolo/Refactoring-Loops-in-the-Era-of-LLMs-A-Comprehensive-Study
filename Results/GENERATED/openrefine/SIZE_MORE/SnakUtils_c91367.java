snaks.forEach(snak -> {
    List<Snak> existingSnaks = snakGroups.computeIfAbsent(snak.getPropertyId(), k -> {
        propertyOrder.add(k);
        return new ArrayList<>();
    });
    if (!existingSnaks.contains(snak)) {
        existingSnaks.add(snak);
    }
});