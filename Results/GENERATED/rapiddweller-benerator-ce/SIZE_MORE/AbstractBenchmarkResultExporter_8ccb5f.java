IntStream.range(0, executionModes.length)
    .forEach(i -> {
        ExecutionMode executionMode = executionModes[i];
        header[i + 1] = !executionMode.isEe()
                ? "CE"
                : executionMode.getThreadCount() > 1
                    ? "EE" + (insertLf ? '\n' : ' ') + executionMode.getThreadCount() + " Threads"
                    : "EE" + (insertLf ? '\n' : ' ') + "1 Thread";
    });