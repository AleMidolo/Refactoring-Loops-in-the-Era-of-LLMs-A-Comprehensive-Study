IntStream.range(0, propertyMessages.length)
    .mapToObj(i -> propertyMessages[i])
    .forEach(propertyMessage -> {
        buffer.append(propertyMessage);
        if (i < propertyMessages.length - 1) {
            buffer.append(", ");
        }
    });