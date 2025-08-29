for (int i = 1; i < 7; i++) {
    sb.append(getElementWithDuplicateSubElement(i));
    if (i < 6) {
        sb.append(",");
    }
}