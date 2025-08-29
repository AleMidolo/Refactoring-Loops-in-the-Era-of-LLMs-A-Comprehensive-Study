for (Entry<String, Function> entry : ControlFunctionRegistry.getFunctionMapping()) {
    Function func = entry.getValue();
    Object result = func.call(bindings, new Object[] { null, null, null, null, null, null, null, null });
    if (returnsNull.contains(ControlFunctionRegistry.getFunctionName(func))) {
        assertNull(result, ControlFunctionRegistry.getFunctionName(func) + " didn't return null on 8 args");
    } else if (returnsFalse.contains(ControlFunctionRegistry.getFunctionName(func))) {
        assertEquals(result, Boolean.FALSE, ControlFunctionRegistry.getFunctionName(func) + " didn't return false on 8 args");
    } else if (!exempt.contains(ControlFunctionRegistry.getFunctionName(func))) {
        assertTrue(result instanceof EvalError, ControlFunctionRegistry.getFunctionName(func) + " didn't error on 8 args");
    }
}