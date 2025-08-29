for (User user : entry.getOwners()) {
    writer.writeString(user.getDisplayName());
}