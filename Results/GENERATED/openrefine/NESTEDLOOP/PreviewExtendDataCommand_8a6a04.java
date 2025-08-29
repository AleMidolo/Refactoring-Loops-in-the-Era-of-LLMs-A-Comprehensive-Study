topicNames.stream()
		.filter(topicName -> {
		    String id = topicIds.get(i);
		    return id != null && map.containsKey(id);
		})
		.forEach(topicName -> {
		    DataExtension ext = map.get(topicIds.get(i));
		    boolean first = true;
		    if (ext.data.length > 0) {
		        Arrays.stream(ext.data)
		                .forEach(row -> {
		                    List<Object> jsonRow = new ArrayList<>();
		                    if (first) {
		                        jsonRow.add(topicName);
		                        first = false;
		                    } else {
		                        jsonRow.add(null);
		                    }
		                    Arrays.stream(row)
		                            .forEach(cell -> jsonRow.add(cell));
		                    rows.add(jsonRow);
		                });
		    } else {
		        List<Object> supplement = new ArrayList<>();
		        String id = topicIds.get(i);
		        if (id != null) {
		            supplement.add(new ReconCandidate(id, topicName, new String[0], 100));
		        } else {
		            supplement.add("<not reconciled>");
		        }
		        rows.add(supplement);
		    }
		});