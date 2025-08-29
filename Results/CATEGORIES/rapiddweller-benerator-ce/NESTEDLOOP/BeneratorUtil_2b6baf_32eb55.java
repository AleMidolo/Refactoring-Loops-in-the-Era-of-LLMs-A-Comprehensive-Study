for (Environment environment : environments.values()) {
    result.append("- ").append(environment.getName()).append(SystemInfo.LF);
    for (SystemRef system : environment.getSystems()) {
        result.append("  # ").append(system.getName()).append(": ").append(system.getType()).append(" - ").append(describe(system)).append(SystemInfo.LF);
    }
}