```java
return _recordFilters.stream()
        .allMatch(recordFilter -> recordFilter.filterRecord(project, record));
```