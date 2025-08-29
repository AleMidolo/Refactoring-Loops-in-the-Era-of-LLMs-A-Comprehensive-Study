IntStream.range(0, cacheSize)
    .mapToObj(i -> generateFromSource())
    .takeWhile(Objects::nonNull)
    .forEach(item -> {
        int bucketIndex = random.randomIndex(infantry);
        ValueBucket<E> bucket = infantry.get(bucketIndex);
        E feed = item.unwrap();
        bucket.add(feed);
        if (bucket.size() == bucketSize) {
            infantry.remove(bucketIndex);
            buckets.add(bucket);
        }
    });