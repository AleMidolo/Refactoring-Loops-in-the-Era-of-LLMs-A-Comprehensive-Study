IntStream.range(0, count)
    .mapToObj(i -> {
        try {
            String line = reader.readLine();
            if (line == null) {
                return null;
            }
            if (line.length() == 0) {
                dataExtensions.add(null);
                return null;
            }
            int rowCount = Integer.parseInt(line);
            IntStream.range(0, rowCount)
                .forEach(r -> IntStream.range(0, columnNames.size())
                    .forEach(c -> {
                        try {
                            String readLine = reader.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }));
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }).collect(Collectors.toList());