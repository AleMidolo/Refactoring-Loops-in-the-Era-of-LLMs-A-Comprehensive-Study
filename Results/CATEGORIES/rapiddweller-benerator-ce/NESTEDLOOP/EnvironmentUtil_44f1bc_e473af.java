for (Environment environment : environments) {
    for (SystemRef system : environment.getSystems()) {
        if (type.equals(system.getType())) {
            result.add(system);
        }
    }
}