for (Method m : methods) {
    if (m.getParameterTypes().length == 0) {
        return m;
    }
}