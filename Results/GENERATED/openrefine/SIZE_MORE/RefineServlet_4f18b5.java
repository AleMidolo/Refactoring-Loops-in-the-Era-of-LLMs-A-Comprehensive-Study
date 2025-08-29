classMappings.stream()
    .filter(m -> m.from.endsWith("*") ? toClassName.startsWith(m.from.substring(0, m.from.length() - 1)) : m.from.equals(toClassName))
    .forEach(m -> toClassName = m.from.endsWith("*") ? m.to + toClassName.substring(m.from.length() - 1) : m.to);