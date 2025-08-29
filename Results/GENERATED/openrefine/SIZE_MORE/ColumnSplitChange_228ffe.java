IntStream.range(0, count)
    .mapToObj(i -> {
        String line;
        try {
            line = reader.readLine();
            if (line == null) {
                return null;
            }
            int valueCount = Integer.parseInt(line);
            List<Serializable> tuple = new ArrayList<>(valueCount);
            return IntStream.range(0, valueCount)
                    .mapToObj(r -> {
                        try {
                            line = reader.readLine();
                            return ParsingUtilities.mapper.readValue(line, Object.class);
                        } catch (IOException e) {
                            e.printStackTrace();
                            return null;
                        }
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    })
    .filter(Objects::nonNull)
    .forEach(tuples::add);