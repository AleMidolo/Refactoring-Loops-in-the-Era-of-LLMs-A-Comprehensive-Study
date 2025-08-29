IntStream.range(0, n)
         .forEach(i -> {
             wrapper = gen.generate(wrapper);
             assertNotNull(wrapper);
             assertNull(wrapper.unwrap());
         });