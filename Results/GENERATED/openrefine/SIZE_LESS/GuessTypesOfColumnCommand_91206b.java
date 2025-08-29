IntStream.range(0, samples.size())
         .forEach(i -> queryMap.put("q" + i, new IndividualQuery(samples.get(i), 3)));