IntStream.range(0, 100)
         .forEach(i -> {
             Date generatedDate = GeneratorUtil.generateNonNull(generator);
             assertTrue("generated date not in expected value set: " + sdf.format(generatedDate), expectedDates.contains(generatedDate));
         });