_processes.stream()
    .filter(p -> !p.isImmediate() && p.isRunning())
    .forEach(Process::cancel);