for (int i = 0; i < array.length; i++) {
    Object value = convertAny(array[i], targetType);
    Array.set(result, i, value);
}