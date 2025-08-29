```java
Arrays.stream(new String[] {".gz", ".bz2"})
    .filter(ext -> fileName.endsWith(ext))
    .findFirst()
    .ifPresent(ext -> fileName = fileName.substring(0, fileName.length() - ext.length()));
```