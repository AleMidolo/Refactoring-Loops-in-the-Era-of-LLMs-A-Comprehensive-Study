IntStream.range(0, Math.min(bestSegments.length, segments.length))
    .filter(i -> !bestSegments[i].equals(segments[i]))
    .findFirst()
    .ifPresent(i -> {});