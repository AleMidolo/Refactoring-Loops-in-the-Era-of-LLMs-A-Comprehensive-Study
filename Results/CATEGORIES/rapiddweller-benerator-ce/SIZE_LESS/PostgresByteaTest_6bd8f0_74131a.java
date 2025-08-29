for (Entity entity : entities) {
    assertArrayEquals(DYN_BYTE_ARRAY, (byte[]) entity.getComponent("c_bytea"));
}