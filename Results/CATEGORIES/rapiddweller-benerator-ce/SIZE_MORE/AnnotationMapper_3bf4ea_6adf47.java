for (Annotation annotation : annotations) {
    if (annotation instanceof Defaults) {
        context.setDefaultsProvider(BeanUtil.newInstance(((Defaults) annotation).value()));
        return true;
    } else if (annotation instanceof Gentle) {
        context.setDefaultsProvider(new GentleDefaultsProvider());
        return true;
    } else if (annotation instanceof Mean) {
        context.setDefaultsProvider(new MeanDefaultsProvider());
        return true;
    }
}