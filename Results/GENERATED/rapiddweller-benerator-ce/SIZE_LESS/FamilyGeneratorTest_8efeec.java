children.stream()
    .forEach(child -> {
        assertEquals(fatherFamilyName, child.getFamilyName());
        assertTrue(child.getAge() >= 1 && child.getAge() <= (Math.min(fatherAge, motherAge)) - 18);
    });