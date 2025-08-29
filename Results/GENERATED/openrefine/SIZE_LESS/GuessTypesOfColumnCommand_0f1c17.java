samples.stream()
       .forEach(i -> queryMap.put("q" + samples.indexOf(i), new IndividualQuery(i, 3));