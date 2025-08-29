IntStream.range(0, width)
    .mapToObj(i -> {
        String value = "data" + (i + 1);
        input.append(value + inputSeparator);
        return value;
    })
    .toArray(i -> data);