IntStream.range(0, 4)
    .forEach(i -> result |= Long.parseLong(ipAddressInArray[3 - i]) << (i * 8));