StringBuilder sb = new StringBuilder();
IntStream.range(1, 7)
    .forEach(i -> sb.append("{\"id\" : " + i + "," + "\"author\" : {\"author-name\" : \"Author " + i + ", The\"," + "\"author-dob\" : \"1950-0" + i + "-15\"}," + "\"title\" : \"Book title " + i + "\"," + "\"publish_date\" : \"2010-05-26\"" + "}" + (i < 6 ? "," : ""));