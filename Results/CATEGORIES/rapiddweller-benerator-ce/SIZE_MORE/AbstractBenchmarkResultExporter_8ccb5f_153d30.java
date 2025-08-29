for (int i = 0; i < executionModes.length; i++) {
    ExecutionMode executionMode = executionModes[i];
    if (!executionMode.isEe()) {
        header[i + 1] = "CE";
    } else if (executionMode.getThreadCount() > 1) {
        header[i + 1] = "EE" + (insertLf ? '\n' : ' ') + executionMode.getThreadCount() + " Threads";
    } else {
        header[i + 1] = "EE" + (insertLf ? '\n' : ' ') + "1 Thread";
    }
}