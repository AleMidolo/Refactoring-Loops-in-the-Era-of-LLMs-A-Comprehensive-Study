for (int i = 0; i < content.length(); i++) {
    char character = content.charAt(i);
    if (character == '<' && (i + 4) < content.length()) {
        String tag = content.substring(i, i + 4);
        if (tag.equals(ph_open)) {
            if (sb.length() > 0) {
                parts.add(escape(sb.toString()));
            }
            sb.setLength(0);
            sb.append(ph_open);
            int temp = i + ph_open.length();
            boolean run = true;
            while (run && temp < content.length()) {
                boolean isSelfClosing = false;
                boolean isClosing = false;
                if (content.length() >= (temp + ph_self_close.length())) {
                    isSelfClosing = content.substring(temp, temp + ph_self_close.length()).equals(ph_self_close);
                }
                if (content.length() >= (temp + ph_close.length())) {
                    isClosing = content.substring(temp, temp + ph_close.length()).equals(ph_close);
                }
                if (isSelfClosing || isClosing) {
                    sb.append(isSelfClosing ? ph_self_close : ph_close);
                    parts.add(sb.toString());
                    i += sb.length() - 1;
                    run = false;
                    sb.setLength(0);
                } else {
                    char current = content.charAt(temp);
                    sb.append(current);
                    temp++;
                }
            }
        } else {
            sb.append(character);
        }
    } else {
        sb.append(character);
    }
}