for (int i = 0; i < uris.length; i++) {
    DataSource<T> source = factory.create(uris[i], context);
    sources[i] = new DataSourceGenerator<>(source);
}