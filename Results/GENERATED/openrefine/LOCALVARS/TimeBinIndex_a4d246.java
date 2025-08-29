Arrays.stream(allValues)
        .mapToLong(d -> (long) Math.max((d - _min) / _step, 0))
        .mapToInt(bin -> (int) bin)
        .forEach(bin -> _bins[bin]++);