IntStream.range(0, digits.length)
            .forEach(i -> buffer[displayColumn[i]] = (digits[i] + digitOffsets[i] + cycleCounter) % radix);