for (Entry<String, String> attribute : attributes.entrySet()) {
    String key = attribute.getKey();
    Object value = attribute.getValue();
    Object result;
    if ("generatorFactory".equals(key)) {
        result = DatabeneScriptParser.parseBeanSpec(value.toString()).evaluate(context);
    } else {
        result = value;
    }
    BeanUtil.setPropertyValue(context, key, result, true, true);
}