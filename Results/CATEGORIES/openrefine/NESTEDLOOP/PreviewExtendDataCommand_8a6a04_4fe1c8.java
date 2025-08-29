for (int r = 0; r < topicNames.size(); r++) {
    String id = topicIds.get(r);
    String topicName = topicNames.get(r);
    if (id != null && map.containsKey(id)) {
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
                for (Object cell : row) {
                    jsonRow.add(cell);
                }
                rows.add(jsonRow);
            }
            continue;
        }
    }
    List<Object> supplement = new ArrayList<>();
    if (id != null) {
        supplement.add(new ReconCandidate(id, topicName, new String[0], 100));
    } else {
        supplement.add("<not reconciled>");
    }
    rows.add(supplement);
}