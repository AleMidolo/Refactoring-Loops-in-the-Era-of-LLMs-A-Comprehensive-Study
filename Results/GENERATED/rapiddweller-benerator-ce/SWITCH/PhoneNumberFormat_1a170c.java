pattern.chars()
    .forEach(c -> {
        switch (c) {
            case 'c':
                number.setCountryCode(parseDigits(source, pos));
                break;
            case 'a':
                number.setAreaCode(parseDigits(source, pos));
                break;
            case 'l':
                number.setLocalNumber(parseDigits(source, pos));
                break;
            default:
                if (source.charAt(pos.getIndex()) != c) {
                    throw BeneratorExceptionFactory.getInstance().illegalArgument("Pattern '" + pattern + "' is not matched by String: " + source);
                }
                pos.setIndex(pos.getIndex() + 1);
        }
    });