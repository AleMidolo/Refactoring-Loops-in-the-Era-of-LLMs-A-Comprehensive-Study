newRows.stream()
        .skip(insertionIndex)
        .forEachIndexed((index, actual) -> {
            Row expected = newRows.get(index + insertionIndex);
            assertSame(actual, expected);
        });