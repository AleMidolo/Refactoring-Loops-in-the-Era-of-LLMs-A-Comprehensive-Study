for (String storageType : storageTypeDimensions) {
    List<Dimension> dimensions = new ArrayList<>();
    dimensions.add(Dimension.builder().name("BucketName").value(resource.name()).build());
    dimensions.add(Dimension.builder().name("StorageType").value(storageType).build());
    Pair<Long, GetMetricStatisticsResponse> bucketSizeBytes = AWSUtils.getCloudwatchMetricMaximum(data.awsRegion, "AWS/S3", "BucketSizeBytes", dimensions, clientCreator);
    final Long bucketSizeMetric = bucketSizeBytes.getValue0();
    if (bucketSizeMetric != null) {
        storageTypeMap.add(Map.of(storageType, bucketSizeMetric));
    }
}