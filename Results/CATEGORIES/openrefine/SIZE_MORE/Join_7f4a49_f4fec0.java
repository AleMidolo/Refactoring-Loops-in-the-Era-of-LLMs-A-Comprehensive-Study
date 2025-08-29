for (Object o : (Object[]) v) {
    if (o != null) {
        if (!isFirst) {
            sb.append(separator);
        }
        sb.append(o);
        isFirst = false;
    }
}