for (int i = 0; i < list.size(); i++) {
    if (i > 0) {
        sb.append(", ");
    }
    writeValue(sb, list.get(i), true);
}