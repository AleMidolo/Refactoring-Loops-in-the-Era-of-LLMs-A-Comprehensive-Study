```java
Arrays.stream(sources)
      .map(File::new)
      .filter(file -> !file.delete())
      .forEach(file -> errorHandler.handleError("File could not be deleted: " + file + ". Probably it is locked"));
```