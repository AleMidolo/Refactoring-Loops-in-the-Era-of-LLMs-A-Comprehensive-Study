details.values().stream()
    .allMatch(detail -> {
        String detailName = detail.getName();
        return NullSafeComparator.equals(detail.getValue(), that.getDetailValue(detailName));
    });