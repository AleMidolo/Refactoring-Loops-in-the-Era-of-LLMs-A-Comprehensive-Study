for (int i = 0; i < noOfColumns; i++) {
    try {
        project.columnModel.addColumn(i, new Column(i, "column" + i), true);
        project.columnModel.columns.get(i).getCellIndex();
    } catch (ModelException e1) {
        Assert.fail("Could not create column");
    }
}