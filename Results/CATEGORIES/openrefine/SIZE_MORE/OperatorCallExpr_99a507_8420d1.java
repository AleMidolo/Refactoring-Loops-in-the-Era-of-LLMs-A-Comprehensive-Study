for (Evaluable ev : _args) {
    if (sb.length() > 0) {
        sb.append(' ');
        sb.append(_op);
        sb.append(' ');
    }
    sb.append(ev.toString());
}