for (int i = 0; i < propertyMessages.length; i++) {
    PropertyMessage propertyMessage = propertyMessages[i];
    buffer.append(propertyMessage);
    if (i < propertyMessages.length - 1) {
        buffer.append(", ");
    }
}