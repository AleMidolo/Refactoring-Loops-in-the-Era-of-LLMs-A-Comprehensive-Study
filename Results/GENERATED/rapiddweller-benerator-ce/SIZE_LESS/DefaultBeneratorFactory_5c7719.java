return parts.values().stream()
        .filter(part -> StringUtil.equalsIgnoreCase(part.getName(), name) && part instanceof ComponentDescriptor)
        .map(part -> (ComponentDescriptor) part)
        .findFirst()
        .orElse(null);