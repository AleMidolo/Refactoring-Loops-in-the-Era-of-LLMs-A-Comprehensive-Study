for (int i = size(); i > delta; i--) {
    set(i, get(i - delta));
}