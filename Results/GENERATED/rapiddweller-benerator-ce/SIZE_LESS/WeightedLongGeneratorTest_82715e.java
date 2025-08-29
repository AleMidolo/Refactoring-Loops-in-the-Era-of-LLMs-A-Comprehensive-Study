expectedValues = Arrays.stream(expectedValuesAsInt)
                            .mapToLong(i -> (long) i)
                            .boxed()
                            .collect(Collectors.toList());