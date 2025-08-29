for (String pkg : descriptor.getPackagesToImport()) {
    context.importPackage(pkg);
}