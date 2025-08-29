topicNames.stream()
    .filter(topicName -> {
        int r = topicNames.indexOf(topicName);
        String id = topicIds.get(r);
        return id != null && map.containsKey(id);
    })
    .forEach(topicName -> {
        int r = topicNames.indexOf(topicName);
        String id = topicIds.get(r);
        DataExtension ext = map.get(id);
        boolean first = true;
        if (ext.data.length > 0) {
            for (Object[] row : ext.data) {
                List<Object> jsonRow = new ArrayList<>();
                if (first) {
                    jsonRow.add(topicName);
                    first = false;
                } else {
                    jsonRow.add(null);
                }
                Arrays.stream(row).forEach(cell -> jsonRow.add(cell));
                rows.add(jsonRow);
            }
        } else {
            List<Object> supplement = new ArrayList<>();
            if (id != null) {
                supplement.add(new ReconCandidate(id, topicName, new String[0], 100));
            } else {
                supplement.add("<not reconciled>");
            }
            rows.add(supplement);
        }
    });