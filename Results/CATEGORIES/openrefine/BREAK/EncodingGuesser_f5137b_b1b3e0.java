for (ObjectNode record : fileRecords) {
    String encoding = JSONUtilities.getString(record, "encoding", null);
    if (!StringUtils.isBlank(encoding)) {
        JSONUtilities.safePut(options, "encoding", encoding);
        break;
    }
}