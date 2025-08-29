for (int i = 0; i < path.length(); i++) {
    char c = path.charAt(i);
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
}