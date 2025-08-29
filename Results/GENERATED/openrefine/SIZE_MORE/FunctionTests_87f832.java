ControlFunctionRegistry.getFunctionMapping().entrySet().stream()
    .forEach(entry -> {
        Function func = entry.getValue();
        if (oneArgs.contains(ControlFunctionRegistry.getFunctionName(func))) {
            Object result = func.call(bindings, new Object[]{null});
            assertTrue(result instanceof EvalError, ControlFunctionRegistry.getFunctionName(func) + " didn't error on null arg");
        } else if (twoArgs.contains(ControlFunctionRegistry.getFunctionName(func))) {
            Object result2 = func.call(bindings, new Object[]{null, null});
            assertTrue(result2 instanceof EvalError, ControlFunctionRegistry.getFunctionName(func) + " didn't error on null args");
        }
    });