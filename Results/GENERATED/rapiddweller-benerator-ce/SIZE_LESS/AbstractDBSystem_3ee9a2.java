propertyNames.stream()
        .map(prop::getProperty)
        .forEach(regularTypes::add);