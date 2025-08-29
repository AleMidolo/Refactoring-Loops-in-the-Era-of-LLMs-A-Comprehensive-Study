services.values().stream()
    .map(service -> (ObjectNode) service)
    .map(service -> JSONUtilities.getObject(service, "view"))
    .filter(Objects::nonNull)
    .forEach(view -> {
        String url = JSONUtilities.getString((ObjectNode) view.get("service"), "url", null);
        String viewUrl = JSONUtilities.getString((ObjectNode) view, "url", null);
        if (url != null && viewUrl != null) {
            identifierSpaceToUrl.put(url, viewUrl);
        }
    });