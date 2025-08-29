for (int col = 0; col < 4; col++) {
    int width = 0;
    for (String[] strings : list) width = Math.max(width, strings[col].length());
    widths[col] = width;
}