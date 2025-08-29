applicationTypes.stream()
    .filter(typeEntity -> typeEntity.getType().equals(ApplicationType.SINGLE_PAGE))
    .findFirst()
    .ifPresent(typeEntity -> {
        final var application = ApplicationGenerator.generateIridiumApplication(entityManager, iridiumTenant, typeEntity);
        this.iridiumAppId = application.getClientId();
    });