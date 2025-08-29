IntStream.range(0, s_max)
    .forEach(i -> {
        StringBuffer sb = new StringBuffer(s_max);
        IntStream.range(0, i)
            .forEach(j -> sb.append('\t'));
        s_indents[i] = sb.toString();
    });