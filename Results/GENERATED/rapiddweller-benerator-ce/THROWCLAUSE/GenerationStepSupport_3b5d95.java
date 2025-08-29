steps.stream()
    .filter(step -> {
        try {
            return step.execute(subContext);
        } catch (Exception e) {
            throw BeneratorExceptionFactory.getInstance().operationFailed("Failure in generation of '" + instanceName + "', Failed step: " + step, e);
        }
    })
    .findFirst()
    .orElseGet(() -> {
        message = "generation step for '" + instanceName + "' is not available any longer: " + steps.get(steps.size() - 1);
        stateLogger.debug(message);
        return false;
    });