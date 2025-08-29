expectedSet = LongStream.rangeClosed(min, max)
                          .boxed()
                          .collect(Collectors.toSet());