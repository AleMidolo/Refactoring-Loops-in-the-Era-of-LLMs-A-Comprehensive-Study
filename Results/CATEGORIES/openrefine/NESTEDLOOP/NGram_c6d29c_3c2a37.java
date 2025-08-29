for (int i = 0; i < len; i++) {
    String[] ss = new String[count];
    for (int j = 0; j < count; j++) {
        ss[j] = tokens[i + j];
    }
    ngrams[i] = StringUtils.join(ss, ' ');
}