def.getProperties().entrySet().stream()
    .forEach(entry -> BeanUtil.setPropertyValue(this, entry.getKey(), entry.getValue(), true, true));