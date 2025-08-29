snaks.stream()
     .forEach(snak -> {
         PropertyIdValue pid = snak.getPropertyId();
         List<Snak> snakList = propertySnakMap.containsKey(pid) ? propertySnakMap.get(pid) : new ArrayList<>();
         snakList.add(snak);
         propertySnakMap.put(pid, snakList);
     });