IntStream.range(0, executionCount)
         .forEach(i -> joiner.execute(context, ErrorHandler.getDefault()));