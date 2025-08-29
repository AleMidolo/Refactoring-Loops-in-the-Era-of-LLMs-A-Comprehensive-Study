details.values().stream()
    .allMatch(detail -> !NullSafeComparator.equals(detail.getValue(), that.getDetailValue(detail.getName())));