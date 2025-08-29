for (Process p : _processes) {
    if (!p.isImmediate() && p.isRunning()) {
        p.cancel();
    }
}