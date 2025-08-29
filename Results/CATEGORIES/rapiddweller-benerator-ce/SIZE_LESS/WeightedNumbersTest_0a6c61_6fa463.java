for (Entity entity : mem.getEntities("x")) {
    counter.count((Integer) entity.getComponent("y"));
}