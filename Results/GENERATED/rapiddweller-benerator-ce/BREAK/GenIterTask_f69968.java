int lastMemberIndex = IntStream.range(0, statements.size())
        .mapToObj(statements::get)
        .filter(statement -> statement instanceof ComponentBuilder
                || statement instanceof CurrentProductGeneration
                || statement instanceof ValidationStatement
                || statement instanceof ConversionStatement)
        .findFirst()
        .map(statements::indexOf)
        .orElse(-1);