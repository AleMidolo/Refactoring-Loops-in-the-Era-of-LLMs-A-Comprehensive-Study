ControlFunctionRegistry.getFunctionMapping().entrySet().stream()
        .forEach(entry -> {
            Function func = entry.getValue();
            Object result = func.call(bindings, new Object[0]);
            if (returnsNull.contains(ControlFunctionRegistry.getFunctionName(func))) {
                assertNull(result, ControlFunctionRegistry.getFunctionName(func) + " didn't return null on 0 args");
            } else if (returnsFalse.contains(ControlFunctionRegistry.getFunctionName(func))) {
                assertEquals(result, Boolean.FALSE, ControlFunctionRegistry.getFunctionName(func) + " didn't return false on 0 args");
            } else if (!valid0args.contains(ControlFunctionRegistry.getFunctionName(func))) {
                assertTrue(result instanceof EvalError, ControlFunctionRegistry.getFunctionName(func) + " didn't error on 0 args");
            }
        });