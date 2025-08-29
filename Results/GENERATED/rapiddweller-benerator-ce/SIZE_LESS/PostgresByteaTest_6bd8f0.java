entities.stream()
        .forEach(entity -> assertArrayEquals(DYN_BYTE_ARRAY, (byte[]) entity.getComponent("c_bytea")));