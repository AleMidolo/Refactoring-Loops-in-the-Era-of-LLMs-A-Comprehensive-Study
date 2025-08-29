for (int i = 0; i < s_max; i++) {
    StringBuffer sb = new StringBuffer(s_max);
    for (int j = 0; j < i; j++) {
        sb.append('\t');
    }
    s_indents[i] = sb.toString();
}