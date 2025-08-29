for (int i = 0; i < length; i++) {
    Array.set(result, i, copyOrSelf(Array.get(array, i)));
}