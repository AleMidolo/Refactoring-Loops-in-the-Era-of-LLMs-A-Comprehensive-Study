IntStream.range(0, 10)
         .forEach(i -> {
             String sentence = generator.generate();
             assertNotNull(sentence);
         });