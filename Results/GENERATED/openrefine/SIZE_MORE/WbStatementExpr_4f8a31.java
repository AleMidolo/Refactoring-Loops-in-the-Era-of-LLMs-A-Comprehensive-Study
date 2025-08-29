snaks.stream()
    .forEach(snak -> {
        List<Snak> existingSnaks = snakGroups.get(snak.getPropertyId());
        if (existingSnaks == null) {
            existingSnaks = new ArrayList<Snak>();
            snakGroups.put(snak.getPropertyId(), existingSnaks);
            propertyOrder.add(snak.getPropertyId());
        }
        if (!existingSnaks.contains(snak)) {
            existingSnaks.add(snak);
        }
    });