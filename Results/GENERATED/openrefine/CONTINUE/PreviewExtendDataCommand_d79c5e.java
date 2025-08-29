topicIds.stream()
        .filter(id -> id != null && map.containsKey(id))
        .forEach(id -> {
            DataExtension ext = map.get(id);
            boolean[] first = {true};
            if (ext.data.length > 0) {
                Arrays.stream(ext.data)
                        .map(row -> {
                            List<Object> jsonRow = new ArrayList<>();
                            if (first[0]) {
                                jsonRow.add(topicNames.get(topicIds.indexOf(id)));
                                first[0] = false;
                            } else {
                                jsonRow.add(null);
                            }
                            Arrays.stream(row).forEach(cell -> jsonRow.add(cell));
                            return jsonRow;
                        })
                        .forEach(rows::add);
                return;
            }
            List<Object> supplement = new ArrayList<>();
            if (id != null) {
                supplement.add(new ReconCandidate(id, topicNames.get(topicIds.indexOf(id)), new String[0], 100));
            } else {
                supplement.add("<not reconciled>");
            }
            rows.add(supplement);
        });