for (int i = statements.size() - 1; i >= 0; i--) {
    Statement statement = statements.get(i);
    if (statement instanceof ComponentBuilder || statement instanceof CurrentProductGeneration || statement instanceof ValidationStatement || statement instanceof ConversionStatement) {
        lastMemberIndex = i;
        break;
    }
}