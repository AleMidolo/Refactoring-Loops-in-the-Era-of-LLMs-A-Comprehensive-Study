IntStream.range(0, content.length())
    .forEach(i -> {
        char character = content.charAt(i);
        if (character == '<' && (i + 4) < content.length()) {
            String tag = content.substring(i, i + 4);
            if (tag.equals(ph_open)) {
                if (sb.length() > 0) {
                    parts.add(escape(sb.toString()));
                }
                sb.setLength(0);
                sb.append(ph_open);
                AtomicInteger temp = new AtomicInteger(i + ph_open.length());
                AtomicBoolean run = new AtomicBoolean(true);
                while (run.get() && temp.get() < content.length()) {
                    AtomicBoolean isSelfClosing = new AtomicBoolean(false);
                    AtomicBoolean isClosing = new AtomicBoolean(false);
                    if (content.length() >= (temp.get() + ph_self_close.length())) {
                        isSelfClosing.set(content.substring(temp.get(), temp.get() + ph_self_close.length()).equals(ph_self_close));
                    }
                    if (content.length() >= (temp.get() + ph_close.length())) {
                        isClosing.set(content.substring(temp.get(), temp.get() + ph_close.length()).equals(ph_close));
                    }
                    if (isSelfClosing.get() || isClosing.get()) {
                        sb.append(isSelfClosing.get() ? ph_self_close : ph_close);
                        parts.add(sb.toString());
                        i += sb.length() - 1;
                        run.set(false);
                        sb.setLength(0);
                    } else {
                        char current = content.charAt(temp.get());
                        sb.append(current);
                        temp.getAndIncrement();
                    }
                }
            } else {
                sb.append(character);
            }
        } else {
            sb.append(character);
        }
    });