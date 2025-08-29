return getEmails().stream()
    .filter(IdentityEmailEntity::isPrimary)
    .findFirst()
    .orElse(null);