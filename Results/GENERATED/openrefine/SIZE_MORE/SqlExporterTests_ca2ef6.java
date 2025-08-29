IntStream.range(0, noOfColumns)
    .forEach(i -> {
        try {
            project.columnModel.addColumn(i, new Column(i, "@" + "column" + " " + i + "/"), true);
        } catch (ModelException e1) {
            Assert.fail("Could not create column");
        }
    });