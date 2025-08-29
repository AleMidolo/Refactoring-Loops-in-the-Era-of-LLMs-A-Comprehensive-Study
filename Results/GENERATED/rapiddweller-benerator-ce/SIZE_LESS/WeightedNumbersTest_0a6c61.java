mem.getEntities("x").stream()
    .map(entity -> (Integer) entity.getComponent("y"))
    .forEach(counter::count);