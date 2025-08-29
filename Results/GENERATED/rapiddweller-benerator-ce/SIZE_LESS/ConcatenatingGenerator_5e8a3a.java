int i = 1;
Arrays.stream(parts, i, parts.length)
    .map(part -> separator + part)
    .forEach(builder::append);