for (Validator<T> validator : validators) {
    assertTrue("'" + format(product) + "' is not valid according to " + validator + ", failed after " + i + " generations", validator.valid(product));
}