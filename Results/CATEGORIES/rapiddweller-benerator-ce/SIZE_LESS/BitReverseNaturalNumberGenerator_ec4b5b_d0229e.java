for (int i = 0; i <= bitsUsed; i++) {
    result |= ((cursor >> i) & 1) << (bitsUsed - i - 1);
}