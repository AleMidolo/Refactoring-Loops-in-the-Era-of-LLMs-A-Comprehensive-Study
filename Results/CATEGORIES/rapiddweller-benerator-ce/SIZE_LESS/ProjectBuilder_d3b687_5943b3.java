for (Map.Entry<String, String> element : elements.entrySet()) {
    if (element.getKey().equals("id")) {
        continue;
    }
    builder.append(String.format("%s.db.%s=%s\n", DBMS, element.getKey(), element.getValue()));
}