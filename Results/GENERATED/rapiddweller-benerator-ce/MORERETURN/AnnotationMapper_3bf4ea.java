annotations.stream()
    .filter(annotation -> annotation instanceof Defaults)
    .map(annotation -> ((Defaults) annotation).value())
    .map(BeanUtil::newInstance)
    .findFirst()
    .ifPresent(defaults -> {
        context.setDefaultsProvider(defaults);
    });

annotations.stream()
    .filter(annotation -> annotation instanceof Gentle || annotation instanceof Mean)
    .findFirst()
    .ifPresent(annotation -> {
        if (annotation instanceof Gentle) {
            context.setDefaultsProvider(new GentleDefaultsProvider());
        } else { // annotation instanceof Mean
            context.setDefaultsProvider(new MeanDefaultsProvider());
        }
    });