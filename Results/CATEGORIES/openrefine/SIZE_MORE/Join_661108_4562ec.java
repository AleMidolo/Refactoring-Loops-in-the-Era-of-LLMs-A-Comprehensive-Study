for (int i = 0; i < l; i++) {
    Object o = JsonValueConverter.convert(a.get(i));
    if (o != null) {
        if (!isFirst) {
            sb.append(separator);
        }
        sb.append(o).toString();
        isFirst = false;
    }
}