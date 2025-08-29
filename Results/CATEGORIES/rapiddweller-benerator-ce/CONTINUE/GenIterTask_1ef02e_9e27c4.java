for (int i = 0; i < statements.size(); i++) {
    Statement statement = statements.get(i);
    success = statement.execute(context);
    if (!success && (statement instanceof ValidationStatement)) {
        i = -1;
        success = true;
        continue;
    }
    if (!success) {
        if (statement instanceof MessageHolder) {
            this.message = ((MessageHolder) statement).getMessage();
        }
        break;
    }
}