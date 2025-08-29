for (FileFormat format : FileFormats.all()) {
    if (format.matchesUri(sourceSpec)) {
        generator = createProtocolSourceGenerator(sourceSpec, format, descriptor, context);
        break;
    }
}