IntStream.range(0, size())
         .mapToObj(i -> this.get(i))
         .map(o -> o == null ? null : (HasFields) o.getField(name, bindings))
         .forEach(l::add);