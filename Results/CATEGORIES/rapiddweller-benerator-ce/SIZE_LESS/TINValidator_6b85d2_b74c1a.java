for (int i = 0; i < 10; i++) {
    int sum = (number.charAt(i) - '0' + product) % 10;
    if (sum == 0) {
        sum = 10;
    }
    product = (sum * 2) % 11;
}