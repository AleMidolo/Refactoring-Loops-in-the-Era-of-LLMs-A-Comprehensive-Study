for (int i = 0; i < 8; i++) {
    sum += (chars[i] - '0') * (1 + (i % 2) * 2);
}