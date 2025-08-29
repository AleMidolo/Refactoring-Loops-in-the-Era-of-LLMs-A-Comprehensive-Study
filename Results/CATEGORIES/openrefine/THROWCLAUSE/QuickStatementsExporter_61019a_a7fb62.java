for (EntityEdit entityEdit : scheduled) {
    if (entityEdit instanceof ItemEdit) {
        translateItem((ItemEdit) entityEdit, writer);
    } else if (entityEdit instanceof MediaInfoEdit) {
        translateMediaInfo((MediaInfoEdit) entityEdit, writer);
    } else {
        throw new IllegalStateException();
    }
}