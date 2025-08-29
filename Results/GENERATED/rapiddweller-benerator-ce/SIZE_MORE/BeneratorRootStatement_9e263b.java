```java
attributes.entrySet().forEach(attribute -> {
    String key = attribute.getKey();
    Object value = attribute.getValue();
    Object result = "generatorFactory".equals(key) ? DatabeneScriptParser.parseBeanSpec(value.toString()).evaluate(context) : value;
    BeanUtil.setPropertyValue(context, key, result, true, true);
});
```