return IntStream.range(0, paramsAnnotations.length)
        .filter(i -> Arrays.stream(paramsAnnotations[i])
                .anyMatch(paramAnnotation -> paramAnnotation.annotationType() == Last.class))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("No parameter annotation with type Last found"));