for (int i = 0; i < 5; i++) {
    server.enqueue(new MockResponse().setResponseCode(503).setBody(Integer.toString(i, 10)));
}