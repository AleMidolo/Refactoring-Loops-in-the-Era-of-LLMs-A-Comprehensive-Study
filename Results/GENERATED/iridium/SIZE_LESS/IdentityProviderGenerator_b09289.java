template.getAuthorizationParameters().stream()
    .forEach(authorizationParam -> authorizationParamHashMap.put(authorizationParam.getName(), authorizationParam.getValue()));