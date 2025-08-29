entry.getOwners().stream()
    .map(User::getDisplayName)
    .forEach(writer::writeString);