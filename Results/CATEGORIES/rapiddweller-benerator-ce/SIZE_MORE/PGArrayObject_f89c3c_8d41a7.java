for (int i = 0; i < objects.length; i++) {
    String obj = "\"" + String.valueOf(objects[i]) + "\"";
    if (i == 0) {
        str.append(obj);
    } else {
        str.append("," + obj);
    }
}