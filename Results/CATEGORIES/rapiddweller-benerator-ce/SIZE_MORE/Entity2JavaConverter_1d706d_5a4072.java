for (Map.Entry<String, Object> entry : entity.getComponents().entrySet()) {
    String featureName = entry.getKey();
    Class<?> targetComponentType = typeOrComponentTypeOf(featureName, targetBeanType);
    if (targetComponentType != null) {
        Object value = convertAny(entry.getValue(), targetComponentType);
        AnyMutator.setValue(result, featureName, value, false, true);
    }
}