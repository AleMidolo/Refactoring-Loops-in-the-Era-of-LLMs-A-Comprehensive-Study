for (int i = 0; i < 100; i++) {
    assertEquals(TaskResult.EXECUTING, proxy.execute(context, ErrorHandler.getDefault()));
}