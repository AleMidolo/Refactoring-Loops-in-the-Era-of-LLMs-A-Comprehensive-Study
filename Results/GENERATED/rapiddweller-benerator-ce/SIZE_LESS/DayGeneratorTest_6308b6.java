IntStream.range(0, 5)
          .forEach(i -> {
              Date generatedDate = generator.generate();
              assertNotNull("Generator unavailable after " + i + " generations", generatedDate);
              Date expectedDate = TimeUtil.addDays(minDate, i);
              assertEquals(expectedDate, generatedDate);
          });