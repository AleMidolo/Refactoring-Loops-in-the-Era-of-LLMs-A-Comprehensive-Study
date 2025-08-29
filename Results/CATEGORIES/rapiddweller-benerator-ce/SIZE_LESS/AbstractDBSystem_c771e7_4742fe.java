for (Map.Entry<String, String> entry : def.getProperties().entrySet()) {
    BeanUtil.setPropertyValue(this, entry.getKey(), entry.getValue(), true, true);
}