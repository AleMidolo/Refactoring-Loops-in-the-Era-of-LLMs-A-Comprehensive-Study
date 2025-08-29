IntStream.range(0, details.length / 2)
    .mapToObj(i -> {
        String detailName = (String) details[i * 2];
        Object expectedValue = details[i * 2 + 1];
        Object actualValue = param1.supportsDetail(detailName) ? param1.getDetailValue(detailName) : param1.getTypeDescriptor().getDetailValue(detailName);
        return new AbstractMap.SimpleEntry<>(expectedValue, actualValue);
    })
    .forEach(entry -> assertEquals(entry.getKey(), entry.getValue()));