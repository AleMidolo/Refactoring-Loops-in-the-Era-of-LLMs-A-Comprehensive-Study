IntStream.rangeClosed(0, bitsUsed)
            .forEach(i -> result |= ((cursor >> i) & 1) << (bitsUsed - i - 1));