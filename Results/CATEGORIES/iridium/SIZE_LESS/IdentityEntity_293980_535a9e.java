for (IdentityEmailEntity email : getEmails()) {
    if (email.isPrimary()) {
        return email;
    }
}