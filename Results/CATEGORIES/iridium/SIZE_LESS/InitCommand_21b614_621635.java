for (ApplicationTypeEntity typeEntity : applicationTypes) {
    if (typeEntity.getType().equals(ApplicationType.SINGLE_PAGE)) {
        final var application = ApplicationGenerator.generateIridiumApplication(entityManager, iridiumTenant, typeEntity);
        this.iridiumAppId = application.getClientId();
    }
}