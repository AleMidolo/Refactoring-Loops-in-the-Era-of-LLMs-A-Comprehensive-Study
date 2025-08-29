for (int i = 0; i < count; i++) {
    if (a.get(i) instanceof ObjectNode) {
        ObjectNode obj = (ObjectNode) a.get(i);
        reconstructOperation(project, obj);
    }
}