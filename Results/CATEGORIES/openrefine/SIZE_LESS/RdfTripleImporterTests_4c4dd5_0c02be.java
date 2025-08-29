for (Row row : project.rows) {
    if (row.cells.size() == 3) {
        Assert.assertEquals(row.cells.get(0).value, "http://example.org/buecher/baum");
        Assert.assertEquals(row.cells.get(1).value, "The Tree@en");
        Assert.assertEquals(row.cells.get(2).value, "Das Buch ist außergewöhnlich@de");
    }
}