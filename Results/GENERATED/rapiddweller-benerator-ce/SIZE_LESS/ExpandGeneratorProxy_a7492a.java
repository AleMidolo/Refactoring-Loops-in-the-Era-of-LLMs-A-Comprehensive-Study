infantry.stream()
        .filter(bucket -> bucket.size() > 0)
        .forEach(buckets::add);