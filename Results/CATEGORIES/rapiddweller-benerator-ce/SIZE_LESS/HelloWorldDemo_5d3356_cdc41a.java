for (int i = 0; i < 5; i++) {
    String salutation = generateNonNull(salutationGenerator);
    String name = generateNonNull(nameGenerator);
    System.out.println(salutation + " " + name);
}