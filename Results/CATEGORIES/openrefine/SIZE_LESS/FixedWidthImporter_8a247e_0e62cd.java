for (int i = widths.size() - 2; i >= 0; i--) {
    if (widths.get(i) == 1) {
        widths.set(i + 1, widths.get(i + 1) + 1);
        widths.remove(i);
    }
}