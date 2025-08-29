for (int i = 1; i < 7; i++) {
    sb.append("{\"id\" : " + i + "," + "\"author\" : {\"author-name\" : \"Author " + i + ", The\"," + "\"author-dob\" : \"1950-0" + i + "-15\"}," + "\"title\" : \"Book title " + i + "\"," + "\"publish_date\" : \"2010-05-26\"" + "}");
    if (i < 6) {
        sb.append(",");
    }
}