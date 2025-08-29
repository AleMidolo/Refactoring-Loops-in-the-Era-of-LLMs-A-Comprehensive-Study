IntStream.range(0, 5)
    .forEach(i -> {
        String salutation = generateNonNull(salutationGenerator);
        String name = generateNonNull(nameGenerator);
        System.out.println(salutation + " " + name);
    });