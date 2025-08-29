for (DBInstance db : dbInstances.dbInstances()) {
    Map<String, Object> instanceMetrics = getRDSCloudWatchMetrics(db.dbInstanceIdentifier(), db.engine(), data, logger, clientCreator);
    allMetrics.put(db.dbInstanceIdentifier() + ":instance", instanceMetrics);
}