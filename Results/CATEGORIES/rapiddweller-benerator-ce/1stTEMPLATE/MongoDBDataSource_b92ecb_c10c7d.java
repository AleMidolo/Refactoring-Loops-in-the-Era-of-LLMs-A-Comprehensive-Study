for (String command : MONGODB_COMMANDS) {
    if (mongoQuery.containsKey(command)) {
        return mongoQuery.get(command).toString();
    }
}