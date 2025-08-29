IntStream.range(0, size())
         .mapToObj(i -> {
             HasFields o = this.get(i);
             return o == null ? null : (HasFields) o.getField(name, bindings);
         })
         .forEach(l::add);