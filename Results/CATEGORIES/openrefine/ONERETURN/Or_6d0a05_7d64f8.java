for (Object o : args) {
    if (Not.objectToBoolean(o)) {
        return true;
    }
}