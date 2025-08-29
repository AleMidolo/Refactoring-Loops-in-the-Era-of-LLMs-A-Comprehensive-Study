for (int i = 0; i < a.length; i++) {
    if (i > 0) {
        sb.append(", ");
    }
    writeValue(sb, a[i], true);
}