for (int i = 0; i < value.length(); i++) {
    if (!allowedValues.contains(value.charAt(i))) {
        return false;
    }
}