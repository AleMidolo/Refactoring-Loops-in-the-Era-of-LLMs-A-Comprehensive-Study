results = cells.stream()
                .map(this::stringToValue)
                .collect(Collectors.toList());