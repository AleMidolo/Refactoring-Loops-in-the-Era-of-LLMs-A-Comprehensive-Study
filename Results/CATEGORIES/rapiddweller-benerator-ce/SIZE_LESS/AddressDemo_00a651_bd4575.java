for (int i = 0; i < 10; i++) {
    Address address = generateNonNull(generator);
    System.out.println(address);
    System.out.printf("phone: %s", address.getPrivatePhone());
    System.out.printf("fax: %s", address.getFax());
    System.out.println();
}