generator = FileFormats.all().stream()
    .filter(format -> format.matchesUri(sourceSpec))
    .findFirst()
    .map(format -> createProtocolSourceGenerator(sourceSpec, format, descriptor, context))
    .orElse(null);