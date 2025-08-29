fileRecords.stream()
            .filter(record -> !StringUtils.isBlank(JSONUtilities.getString(record, "encoding", null)))
            .findFirst()
            .ifPresent(record -> JSONUtilities.safePut(options, "encoding", JSONUtilities.getString(record, "encoding", null));