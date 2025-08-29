IntStream.range(1, args.length)
    .forEach(i -> {
        int thisIndex = lastIndex;
        Object o2 = args[i];
        if (o2 instanceof Number) {
            thisIndex = Math.min(s.length(), lastIndex + Math.max(0, ((Number) o2).intValue()));
        }
        results[i - 1] = s.substring(lastIndex, thisIndex);
        lastIndex = thisIndex;
    });