requests.stream()
        .filter(request -> request.getAppendDimension() instanceof AppendDimensionRequest)
        .findFirst()
        .ifPresent(request -> {return;});