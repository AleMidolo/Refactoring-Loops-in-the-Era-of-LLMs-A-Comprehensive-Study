for (int i = 0; i < 10; i++) {
    int digit = number.charAt(i) - '0';
    boolean used = digitUsed[digit];
    if (!used) {
        digitUsed[digit] = true;
    } else {
        doubleCount++;
        if (doubleCount == 2) {
            return false;
        }
    }
}