Arrays.stream(array)
      .filter(elementDescriptor -> type.getElement(Arrays.asList(array).indexOf(elementDescriptor), true) != null)
      .forEach(elementDescriptor -> {
          TypeDescriptor elementType = elementDescriptor.getTypeDescriptor();
          Object elementValue = array[Arrays.asList(array).indexOf(elementDescriptor)];
          if (elementType instanceof SimpleTypeDescriptor) {
              PrimitiveType primitive = ((SimpleTypeDescriptor) elementType).getPrimitiveType();
              if (primitive == null) {
                  primitive = PrimitiveType.STRING;
              }
              Class<?> javaType = primitive.getJavaType();
              Object javaValue = AnyConverter.convert(elementValue, javaType);
              array[Arrays.asList(array).indexOf(elementDescriptor)] = javaValue;
          } else {
              array[Arrays.asList(array).indexOf(elementDescriptor)] = elementValue;
          }
      });