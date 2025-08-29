platformImports.stream()
    .forEach(platformImport -> Importer.importPlatformClasses(platformImport, context));