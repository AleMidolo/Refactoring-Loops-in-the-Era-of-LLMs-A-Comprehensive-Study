Arrays.stream(parts)
        .map(part -> {
            Integer componentLength = part.maxLength();
            if (componentLength != null && maxComponentLength != null) {
                componentLength = Math.min(componentLength, maxComponentLength);
            }
            if (componentLength != null && remainingLength != null) {
                componentLength = Math.min(componentLength, remainingLength);
            }
            components[Arrays.asList(parts).indexOf(part)] = createFromObject(part, part.minLength(), componentLength, uniqueness, factory);
            if (remainingLength != null) {
                remainingLength -= part.minLength();
                if (remainingLength < 0) {
                    throw BeneratorExceptionFactory.getInstance().configurationError("Remaining length is negative: " + remainingLength);
                }
            }
            return part;
        })
        .count();