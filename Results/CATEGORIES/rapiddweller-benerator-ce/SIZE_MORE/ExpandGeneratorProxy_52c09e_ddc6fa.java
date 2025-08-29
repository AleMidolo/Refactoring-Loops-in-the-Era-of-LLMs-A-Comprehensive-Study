for (int i = 0; i < cacheSize && (wrapper = generateFromSource()) != null; i++) {
    int bucketIndex = random.randomIndex(infantry);
    ValueBucket<E> bucket = infantry.get(bucketIndex);
    E feed = wrapper.unwrap();
    bucket.add(feed);
    if (bucket.size() == bucketSize) {
        infantry.remove(bucketIndex);
        buckets.add(bucket);
    }
}