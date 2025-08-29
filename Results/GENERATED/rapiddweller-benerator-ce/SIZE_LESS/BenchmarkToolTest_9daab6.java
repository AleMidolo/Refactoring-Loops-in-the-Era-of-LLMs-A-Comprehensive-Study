IntStream.range(0, systems.length)
            .forEach(i -> assertEquals(BUILTIN_DBS[i], systems[i].toString()));