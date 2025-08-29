Arrays.stream(allValues)
    .mapToDouble(d -> (int) Math.floor((d - _min) / _step))
    .mapToInt(bin -> Math.max(bin, 0))
    .forEach(bin -> _bins[bin]++);