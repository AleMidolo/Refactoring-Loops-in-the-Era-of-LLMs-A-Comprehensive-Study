IntStream.range(0, path.length())
    .mapToObj(i -> path.charAt(i))
    .forEach(c -> {
        switch(c) {
            case '[':
                depth++;
                builder.append(c);
                break;
            case ']':
                depth--;
                builder.append(c);
                break;
            case '/':
                if (depth == 0) {
                    list.add(builder.toString());
                    builder.delete(0, builder.length());
                    break;
                }
            default:
                builder.append(c);
        }
    });