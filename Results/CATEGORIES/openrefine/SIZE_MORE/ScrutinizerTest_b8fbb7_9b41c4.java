for (Snak snak : snaks) {
    PropertyIdValue pid = snak.getPropertyId();
    List<Snak> snakList;
    if (propertySnakMap.containsKey(pid)) {
        snakList = propertySnakMap.get(pid);
    } else {
        snakList = new ArrayList<>();
    }
    snakList.add(snak);
    propertySnakMap.put(pid, snakList);
}