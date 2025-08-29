Arrays.stream(parts, 1, parts.length)
      .forEach(part -> builder.append(separator).append(part));