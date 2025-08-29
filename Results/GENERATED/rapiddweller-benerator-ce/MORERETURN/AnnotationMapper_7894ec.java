annotations.stream()
    .filter(annotation -> annotation instanceof Factory)
    .findFirst()
    .ifPresent(annotation -> {
        GeneratorFactory factory = BeanUtil.newInstance(((Factory) annotation).value());
        factory.setDefaultsProvider(context.getDefaultsProvider());
        context.setGeneratorFactory(factory);
    });

annotations.stream()
    .filter(annotation -> annotation instanceof Equivalence || annotation instanceof Coverage || annotation instanceof Stochastic || annotation instanceof Serial)
    .findFirst()
    .ifPresent(annotation -> {
        if (annotation instanceof Equivalence) {
            context.setGeneratorFactory(new EquivalenceGeneratorFactory());
        } else if (annotation instanceof Coverage) {
            context.setGeneratorFactory(new CoverageGeneratorFactory());
        } else if (annotation instanceof Stochastic) {
            context.setGeneratorFactory(new StochasticGeneratorFactory());
        } else if (annotation instanceof Serial) {
            context.setGeneratorFactory(new SerialGeneratorFactory());
        }
    });