Arrays.stream(steps)
      .filter(step -> diff / step <= 100)
      .findFirst()
      .ifPresent(step -> _step = step);