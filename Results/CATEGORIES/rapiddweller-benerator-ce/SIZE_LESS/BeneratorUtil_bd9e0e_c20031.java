for (SystemRef system : environment.getSystems()) {
    result.append("  # ").append(system.getName()).append(": ").append(system.getType()).append(" - ").append(describe(system)).append(SystemInfo.LF);
}