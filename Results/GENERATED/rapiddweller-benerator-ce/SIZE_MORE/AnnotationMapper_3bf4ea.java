annotations.stream()
    .filter(annotation -> annotation instanceof Defaults)
    .map(annotation -> (Defaults) annotation)
    .forEach(annotation -> {
        context.setDefaultsProvider(BeanUtil.newInstance(annotation.value()));
        return true;
    });

annotations.stream()
    .filter(annotation -> annotation instanceof Gentle || annotation instanceof Mean)
    .forEach(annotation -> {
        if (annotation instanceof Gentle) {
            context.setDefaultsProvider(new GentleDefaultsProvider());
        } else {
            context.setDefaultsProvider(new MeanDefaultsProvider());
        }
        return true;
    });