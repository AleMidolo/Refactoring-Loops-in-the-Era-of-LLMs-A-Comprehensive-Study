dbInstances.dbInstances().stream()
    .forEach(db -> allMetrics.put(db.dbInstanceIdentifier() + ":instance",
                        getRDSCloudWatchMetrics(db.dbInstanceIdentifier(), db.engine(), data, logger, clientCreator)));