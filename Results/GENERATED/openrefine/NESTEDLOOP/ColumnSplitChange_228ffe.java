IntStream.range(0, count)
         .mapToObj(i -> {
             try {
                 String line = reader.readLine();
                 if (line == null) {
                     return null;
                 }
                 int valueCount = Integer.parseInt(line);
                 List<Serializable> tuple = new ArrayList<>(valueCount);
                 return IntStream.range(0, valueCount)
                                 .mapToObj(r -> {
                                     try {
                                         String line2 = reader.readLine();
                                         return (Serializable) ParsingUtilities.mapper.readValue(line2, Object.class);
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
         .collect(Collectors.toList());