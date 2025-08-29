```
result = IntStream.range(0, tokens.length)
    .mapToObj(i -> elementParser.parse(StringUtil.trim(tokens[i])))
    .toArray(ElementType[]::new);
```