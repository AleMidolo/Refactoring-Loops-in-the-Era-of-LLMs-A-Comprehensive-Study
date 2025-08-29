IntStream.range(0, count)
    .mapToObj(i -> {
        try {
            String line = reader.readLine();
            return (line == null || line.length() == 0) ? null : ReconType.load(line));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }})
    .forEach(columnTypes::add);