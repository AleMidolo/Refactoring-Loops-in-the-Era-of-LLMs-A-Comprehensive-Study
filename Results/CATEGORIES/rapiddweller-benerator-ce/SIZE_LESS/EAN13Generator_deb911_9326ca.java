for (int i = 0; i < 12; i++) {
    sum += (chars[i] - '0') * (1 + (i % 2) * 2);
}