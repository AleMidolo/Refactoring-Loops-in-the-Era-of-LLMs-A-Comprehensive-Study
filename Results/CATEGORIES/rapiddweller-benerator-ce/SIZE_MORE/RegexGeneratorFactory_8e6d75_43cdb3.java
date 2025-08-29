for (int i = 0; i < parts.length; i++) {
    RegexPart part = parts[i];
    Integer componentLength = part.maxLength();
    if (componentLength != null && maxComponentLength != null) {
        componentLength = Math.min(componentLength, maxComponentLength);
    }
    if (componentLength != null && remainingLength != null) {
        componentLength = Math.min(componentLength, remainingLength);
    }
    components[i] = createFromObject(part, part.minLength(), componentLength, uniqueness, factory);
    if (remainingLength != null) {
        remainingLength -= part.minLength();
        if (remainingLength < 0) {
            throw BeneratorExceptionFactory.getInstance().configurationError("Remaining length is negative: " + remainingLength);
        }
    }
}