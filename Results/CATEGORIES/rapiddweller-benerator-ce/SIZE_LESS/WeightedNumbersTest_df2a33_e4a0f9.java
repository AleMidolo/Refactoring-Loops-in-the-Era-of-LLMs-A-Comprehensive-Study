for (Entity entity : mem.getEntities("x")) {
    counter.count(((Entity[]) entity.getComponent("y")).length);
}