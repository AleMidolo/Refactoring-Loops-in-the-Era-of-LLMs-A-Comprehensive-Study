for (int i = 0; i < s.length(); i++) {
    output[i] = translateType(Character.getType(s.codePointAt(i)));
}