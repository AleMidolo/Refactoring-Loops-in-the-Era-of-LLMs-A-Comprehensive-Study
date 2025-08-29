Arrays.stream(nameValuePairs)
      .filter((element, index) -> index % 2 == 0)
      .forEach(index -> {
          String name = (String) nameValuePairs[index];
          Object expected = nameValuePairs[index + 1];
          Object actual = entity.getComponent(name);
          assertEquals("Unexpected value for component '" + name + "':", expected, actual);
      });