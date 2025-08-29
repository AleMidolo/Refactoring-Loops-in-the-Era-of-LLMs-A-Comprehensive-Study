fileRecords.stream()
        .map(record -> JSONUtilities.getString(record, "encoding", null))
        .filter(encoding -> !StringUtils.isBlank(encoding))
        .findFirst()
        .ifPresent(encoding -> JSONUtilities.safePut(options, "encoding", encoding));