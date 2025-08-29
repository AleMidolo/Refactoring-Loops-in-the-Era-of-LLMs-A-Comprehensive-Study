IntStream.range(0, len)
    .forEach(i -> {
        String[] ss = new String[count];
        IntStream.range(0, count)
            .forEach(j -> ss[j] = tokens[i + j]);
        ngrams[i] = StringUtils.join(ss, ' ');
    });