annotations.stream()
    .anyMatch(annotation -> {
        if (annotation instanceof Factory) {
            GeneratorFactory factory = BeanUtil.newInstance(((Factory) annotation).value());
            factory.setDefaultsProvider(context.getDefaultsProvider());
            context.setGeneratorFactory(factory);
            return true;
        } else if (annotation instanceof Equivalence) {
            context.setGeneratorFactory(new EquivalenceGeneratorFactory());
            return true;
        } else if (annotation instanceof Coverage) {
            context.setGeneratorFactory(new CoverageGeneratorFactory());
            return true;
        } else if (annotation instanceof Stochastic) {
            context.setGeneratorFactory(new StochasticGeneratorFactory());
            return true;
        } else if (annotation instanceof Serial) {
            context.setGeneratorFactory(new SerialGeneratorFactory());
            return true;
        }
        return false;
    });