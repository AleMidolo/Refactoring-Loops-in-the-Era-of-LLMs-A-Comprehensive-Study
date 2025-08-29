for (int i = 0; i < samples.size(); i++) {
    queryMap.put("q" + i, new IndividualQuery(samples.get(i), 3));
}