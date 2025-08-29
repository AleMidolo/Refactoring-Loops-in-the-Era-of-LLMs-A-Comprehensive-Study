int lastMemberIndex = IntStream.range(0, statements.size())
    .mapToObj(i -> statements.get(statements.size() - 1 - i))
    .filter(statement -> statement instanceof ComponentBuilder 
                        || statement instanceof CurrentProductGeneration 
                        || statement instanceof ValidationStatement 
                        || statement instanceof ConversionStatement)
    .findFirst()
    .map(statements::indexOf)
    .orElse(-1);