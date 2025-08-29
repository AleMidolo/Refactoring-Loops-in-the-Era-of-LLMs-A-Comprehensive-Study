for (Validator<?> validator : validators) {
    if (validator instanceof Resettable) {
        ((Resettable) validator).reset();
    }
}