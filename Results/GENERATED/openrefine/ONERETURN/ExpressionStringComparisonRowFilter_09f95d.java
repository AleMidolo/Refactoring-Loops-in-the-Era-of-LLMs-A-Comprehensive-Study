return IntStream.range(0, l)
                .mapToObj(i -> JsonValueConverter.convert(a.get(i)).toString())
                .anyMatch(this::checkValue) != invert;