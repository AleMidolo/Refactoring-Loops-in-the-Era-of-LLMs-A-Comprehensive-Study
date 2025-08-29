Random random = new Random();
IntStream.range(0, 10).forEach(i -> {
    boolean done = true;
    do {
        int digit = random.nextInt(10);
        if (!digitsUsed[digit]) {
            buffer[i] = (char) ('0' + digit);
            digitsUsed[digit] = true;
            done = true;
        } else if (doubleCount == 0) {
            buffer[i] = (char) ('0' + digit);
            doubleCount++;
            done = true;
        } else {
            done = false;
        }
    } while (!done);
});