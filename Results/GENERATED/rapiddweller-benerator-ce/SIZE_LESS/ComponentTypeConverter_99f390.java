collection.stream()
          .map(item -> convert(item, (ComplexTypeDescriptor) componentType))
          .forEach(builder::add);