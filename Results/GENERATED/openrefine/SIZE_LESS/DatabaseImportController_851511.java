ex = exceptions.stream()
        .map(Exception::getLocalizedMessage)
        .collect(Collectors.joining("\n"));