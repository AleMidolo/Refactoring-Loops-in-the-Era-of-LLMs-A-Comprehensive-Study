for (int i = 0; i < params.length; i++) {
    statement.setObject(2 + i, params[i]);
}