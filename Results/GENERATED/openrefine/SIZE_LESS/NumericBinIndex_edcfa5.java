Arrays.stream(allValues)
    .mapToDouble(d -> (int) Math.max(Math.floor((d - _min) / _step), 0))
    .mapToInt(bin -> bin)
    .forEach(bin -> _bins[bin]++);