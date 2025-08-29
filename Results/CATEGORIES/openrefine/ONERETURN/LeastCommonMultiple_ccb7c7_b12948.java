for (int i = 1; i <= largerValue; i++) {
    if ((largerValue * i) % smallerValue == 0) {
        return largerValue * i;
    }
}