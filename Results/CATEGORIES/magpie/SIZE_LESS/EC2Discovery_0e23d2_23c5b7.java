for (int i = 3; i >= 0; i--) {
    long ip = Long.parseLong(ipAddressInArray[3 - i]);
    result |= ip << (i * 8);
}