```java
_projectsMetadata.entrySet().stream()
    .filter(entry -> {
        ProjectMetadata metadata = entry.getValue();
        return metadata != null && name.equals(metadata.getName());
    })
    .forEach(entry -> {
        id = entry.getKey();
        count += 1;
    });
```