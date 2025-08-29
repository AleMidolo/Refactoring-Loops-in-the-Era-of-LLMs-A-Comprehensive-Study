IntStream.range(0, names.getLength())
        .mapToObj(i -> names.item(i).getTextContent())
        .forEach(name -> assertTrue("Not an anonymized name: " + name, anonNames.contains(name)));