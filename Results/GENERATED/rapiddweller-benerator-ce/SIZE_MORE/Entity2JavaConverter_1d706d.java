entity.getComponents().entrySet()
        .forEach(entry -> {
            String featureName = entry.getKey();
            Class<?> targetComponentType = typeOrComponentTypeOf(featureName, targetBeanType);
            if (targetComponentType != null) {
                Object value = convertAny(entry.getValue(), targetComponentType);
                AnyMutator.setValue(result, featureName, value, false, true);
            }
        });