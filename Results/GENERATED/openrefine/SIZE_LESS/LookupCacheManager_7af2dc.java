targetProject.rows.stream()
        .forEach(r -> lookup.valueToRowIndices.put(String.valueOf(r), Collections.singletonList(r)));