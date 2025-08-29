for (int i = 0; i < 5; i++) {
    server.enqueue(new MockResponse().setHeader("Retry-After", 1).setResponseCode(429).setBody(Integer.toString(i, 10)));
}