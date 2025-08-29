mem.getEntities("x").stream()
    .map(entity -> ((Entity[]) entity.getComponent("y")).length)
    .forEach(counter::count);