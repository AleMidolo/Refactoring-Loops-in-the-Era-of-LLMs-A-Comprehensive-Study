IntStream.range(0, components.length)
         .forEach(i -> builders[i] = createComponentBuilder(components[i], ownerUniqueness, iterationMode, context));