IntStream.range(0, length)
         .filter(i -> wrapper != null)
         .forEach(i -> {
             writer.setVariable("part_index", i);
             wrapper = generator.generate(wrapper);
             if (wrapper != null) {
                 writer.writeElement(wrapper.unwrap());
             }
         });