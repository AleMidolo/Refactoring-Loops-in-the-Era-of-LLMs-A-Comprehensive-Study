for (Request request : requests) {
    if (request.getAppendDimension() instanceof AppendDimensionRequest) {
        return;
    }
}