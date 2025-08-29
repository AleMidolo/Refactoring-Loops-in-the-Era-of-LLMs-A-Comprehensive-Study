for (int i = 0; i < count; i++) {
    ObjectNode service = (ObjectNode) services.get(i);
    ObjectNode view = JSONUtilities.getObject(service, "view");
    if (view != null) {
        String url = JSONUtilities.getString(service, "url", null);
        String viewUrl = JSONUtilities.getString(view, "url", null);
        if (url != null && viewUrl != null) {
            identifierSpaceToUrl.put(url, viewUrl);
        }
    }
}