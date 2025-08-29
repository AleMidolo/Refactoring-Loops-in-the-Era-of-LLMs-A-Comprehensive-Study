IntStream.range(1, 4)
    .forEach(i -> Assert.assertEquals(project.rows.get(i).getCellValue(1).toString(), ref_val));