ext.data.stream()
    .map(row -> {
        List<Object> jsonRow = new ArrayList<>();
        if (first) {
            jsonRow.add(topicName);
            first = false;
        } else {
            jsonRow.add(null);
        }
        Arrays.stream(row).forEach(jsonRow::add);
        return jsonRow;
    })
    .forEach(rows::add);