for (DBUniqueConstraint constraint : ukConstraints) {
    if (constraint.getColumnNames().length == 1) {
        descriptor.setUnique(true);
    } else {
        logger.debug("Automated uniqueness assurance on multiple columns is not provided yet: {}", constraint);
    }
}