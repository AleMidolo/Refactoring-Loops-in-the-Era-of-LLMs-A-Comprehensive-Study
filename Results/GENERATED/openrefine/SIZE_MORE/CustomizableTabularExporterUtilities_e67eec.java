IntStream.range(0, count)
    .mapToObj(i -> (ObjectNode) services.get(i))
    .map(service -> JSONUtilities.getObject(service, "view"))
    .filter(Objects::nonNull)
    .forEach(view -> {
        String url = JSONUtilities.getString(view, "url", null);
        String viewUrl = JSONUtilities.getString(view, "url", null);
        if (url != null && viewUrl != null) {
            identifierSpaceToUrl.put(url, viewUrl);
        }
    });