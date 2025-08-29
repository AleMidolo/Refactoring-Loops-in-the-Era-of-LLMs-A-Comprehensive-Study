IntStream.range(0, Math.min(bestSegments.length, segments.length))
    .takeWhile(i -> bestSegments[i].equals(segments[i]))
    .count();