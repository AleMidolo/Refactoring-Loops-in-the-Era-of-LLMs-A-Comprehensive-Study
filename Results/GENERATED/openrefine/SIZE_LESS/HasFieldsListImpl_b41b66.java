Arrays.stream(r)
    .mapToObj(i -> get(i))
    .map(o -> o == null ? null : o.getField(name, bindings))
    .toArray(HasField[]::new);