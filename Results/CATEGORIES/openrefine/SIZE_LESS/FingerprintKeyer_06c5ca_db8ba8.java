for (int i = 0; i < orig.length(); i++) {
    String source = orig.substring(i, i + 1);
    String replace = NONDIACRITICS.get(source);
    result.append(replace == null ? source : replace);
}