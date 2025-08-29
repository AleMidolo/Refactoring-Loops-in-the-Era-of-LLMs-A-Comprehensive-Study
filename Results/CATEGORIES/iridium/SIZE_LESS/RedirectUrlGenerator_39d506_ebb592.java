for (Map.Entry<String, String> entry : params.entrySet()) {
    requestParams.put(entry.getKey(), List.of(entry.getValue()));
}