for (int i = 0; i < Array.getLength(o1); i++) {
    if (!equalIgnoringDescriptor(Array.get(o1, i), Array.get(o2, i))) {
        return false;
    }
}