storageTypeDimensions.stream()
    .map(storageType -> {
        List<Dimension> dimensions = new ArrayList<>();
        dimensions.add(Dimension.builder().name("BucketName").value(resource.name()).build());
        dimensions.add(Dimension.builder().name("StorageType").value(storageType).build());
        return Pair.of(AWSUtils.getCloudwatchMetricMaximum(data.awsRegion, "AWS/S3", "BucketSizeBytes", dimensions, clientCreator).getValue0(), storageType);
    })
    .filter(pair -> pair.getKey() != null)
    .forEach(pair -> storageTypeMap.add(Map.of(pair.getValue(), pair.getKey()));