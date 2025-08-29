IntStream.range(0, len).forEach(i -> {
    String[] ss = IntStream.range(0, count)
                            .mapToObj(j -> tokens[i + j])
                            .toArray(String[]::new);
    ngrams[i] = StringUtils.join(ss, ' ');
});