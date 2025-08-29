if (requests.stream().anyMatch(request -> request.getAppendDimension() instanceof AppendDimensionRequest)) {
    return;
}