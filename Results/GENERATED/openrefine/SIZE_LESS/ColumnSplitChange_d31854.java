IntStream.range(0, valueCount)
         .mapToObj(r -> {
             try {
                 return (Serializable) ParsingUtilities.mapper.readValue(reader.readLine(), Object.class);
             } catch (IOException e) {
                 e.printStackTrace();
             }
             return null;
         })
         .forEach(tuple::add);