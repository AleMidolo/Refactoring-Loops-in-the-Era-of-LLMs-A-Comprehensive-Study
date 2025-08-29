for (int i = 0; i < 100; i++) {
    Row row = new Row(2);
    row.setCell(0, new Cell(i < 5 ? "apple" : "orange", null));
    project.rows.add(row);
    server.enqueue(new MockResponse().setBody(Integer.toString(rand.nextInt(100))));
}