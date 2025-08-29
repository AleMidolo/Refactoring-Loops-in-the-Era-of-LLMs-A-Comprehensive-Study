IntStream.range(0, topicNames.size())
        .filter(r -> {
            String id = topicIds.get(r);
            String topicName = topicNames.get(r);
            return id != null && map.containsKey(id);
        })
        .forEach(r -> {
            String id = topicIds.get(r);
            String topicName = topicNames.get(r);
            DataExtension ext = map.get(id);
            boolean first = true;
            if (ext.data.length > 0) {
                Arrays.stream(ext.data).map(row -> {
                    List<Object> jsonRow = new ArrayList<>();
                    if (first) {
                        jsonRow.add(topicName);
                        first = false;
                    } else {
                        jsonRow.add(null);
                    }
                    Arrays.stream(row).forEach(cell -> jsonRow.add(cell));
                    return jsonRow;
                }).forEach(rows::add);
                return;
            }
            List<Object> supplement = new ArrayList<>();
            if (id != null) {
                supplement.add(new ReconCandidate(id, topicName, new String[0], 100));
            } else {
                supplement.add("<not reconciled>");
            }
            rows.add(supplement);
        });