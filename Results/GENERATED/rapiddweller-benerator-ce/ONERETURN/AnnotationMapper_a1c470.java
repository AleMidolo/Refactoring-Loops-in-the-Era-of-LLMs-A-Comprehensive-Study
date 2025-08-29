int index = IntStream.range(0, paramsAnnotations.length)
        .filter(i -> Arrays.stream(paramsAnnotations[i]).anyMatch(paramAnnotation -> paramAnnotation.annotationType() == Last.class))
        .findFirst()
        .orElse(-1);