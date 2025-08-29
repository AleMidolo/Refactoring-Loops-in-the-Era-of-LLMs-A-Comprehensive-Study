for (Throwable throwable : suppressed) {
    printStackTrace(throwable, indent + "\t", "Suppressed: ", seen);
}