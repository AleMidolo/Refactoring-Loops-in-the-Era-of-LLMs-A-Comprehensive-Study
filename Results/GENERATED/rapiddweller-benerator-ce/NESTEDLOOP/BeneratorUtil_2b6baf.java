environments.values().stream()
    .forEach(environment -> {
        result.append("- ").append(environment.getName()).append(SystemInfo.LF);
        environment.getSystems().stream()
            .forEach(system -> result.append("  # ").append(system.getName()).append(": ").append(system.getType()).append(" - ").append(describe(system)).append(SystemInfo.LF));
    });