for (FeatureDetail<?> detail : descriptor.getDetails()) {
    if (!ATT_NAME.equals(detail.getName())) {
        mapDetailToBeanProperty(descriptor, detail.getName(), bean, context);
    }
}