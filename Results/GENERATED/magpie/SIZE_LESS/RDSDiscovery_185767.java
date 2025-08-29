dbInstances.dbInstances().stream()
    .map(db -> getRDSCloudWatchMetrics(db.dbInstanceIdentifier(), db.engine(), data, logger, clientCreator))
    .forEach(instanceMetrics -> allMetrics.put(db.dbInstanceIdentifier() + ":instance", instanceMetrics));