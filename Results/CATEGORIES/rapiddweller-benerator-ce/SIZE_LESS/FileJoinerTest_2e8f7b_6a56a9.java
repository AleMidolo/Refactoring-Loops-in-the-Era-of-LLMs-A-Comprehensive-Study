for (int i = 0; i < executionCount; i++) {
    joiner.execute(context, ErrorHandler.getDefault());
}