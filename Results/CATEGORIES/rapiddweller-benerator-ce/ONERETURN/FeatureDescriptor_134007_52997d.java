for (FeatureDetail<?> detail : details.values()) {
    String detailName = detail.getName();
    if (!NullSafeComparator.equals(detail.getValue(), that.getDetailValue(detailName))) {
        return false;
    }
}