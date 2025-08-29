Arrays.stream(allValues)
        .mapToDouble(d -> Math.max((int) Math.floor((d - _min) / _step), 0))
        .forEach(bin -> _bins[bin]++);