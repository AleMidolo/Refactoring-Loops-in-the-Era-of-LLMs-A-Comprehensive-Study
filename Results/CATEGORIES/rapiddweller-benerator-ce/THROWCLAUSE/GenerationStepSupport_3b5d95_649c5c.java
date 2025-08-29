for (GenerationStep<E> step : steps) {
    try {
        if (!step.execute(subContext)) {
            message = "generation step for '" + instanceName + "' is not available any longer: " + step;
            stateLogger.debug(message);
            return false;
        }
    } catch (Exception e) {
        throw BeneratorExceptionFactory.getInstance().operationFailed("Failure in generation of '" + instanceName + "', Failed step: " + step, e);
    }
}