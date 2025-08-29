values.stream()
      .forEach(pattern -> {
          String errorMessage = "Value assumed to be " + (expectedMatch ? "legal" : "illegal") + " for type '" + typeName + "': " + pattern;
          assertEquals(errorMessage, expectedMatch, p.matcher(pattern).matches());
      });