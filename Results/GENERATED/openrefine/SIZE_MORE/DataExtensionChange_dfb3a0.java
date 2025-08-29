reader.lines()
            .limit(count)
            .map(line -> {
                try {
                    int rowCount = Integer.parseInt(line);
                    for (int r = 0; r < rowCount; r++) {
                        for (int c = 0; c < columnNames.size(); c++) {
                            line = reader.readLine();
                        }
                    }
                } catch (NumberFormatException e) {
                    dataExtensions.add(null);
                }
                return line;
            })
            .collect(Collectors.toList());