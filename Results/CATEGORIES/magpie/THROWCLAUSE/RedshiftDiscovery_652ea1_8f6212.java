for (final var parameterGroup : cluster.clusterParameterGroups()) {
    try {
        parameterGroups.put(parameterGroup.parameterGroupName(), client.describeClusterParameters(DescribeClusterParametersRequest.builder().parameterGroupName(parameterGroup.parameterGroupName()).build()).toBuilder());
    } catch (Exception ex) {
        logger.debug("Couldn't query cluster parameter group.", ex);
    }
}