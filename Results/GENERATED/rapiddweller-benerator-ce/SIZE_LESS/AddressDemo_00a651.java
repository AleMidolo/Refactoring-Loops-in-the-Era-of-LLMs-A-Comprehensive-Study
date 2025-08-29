IntStream.range(0, 10)
    .mapToObj(i -> generateNonNull(generator))
    .forEach(address -> {
        System.out.println(address);
        System.out.printf("phone: %s", address.getPrivatePhone());
        System.out.printf("fax: %s", address.getFax());
        System.out.println();
    });