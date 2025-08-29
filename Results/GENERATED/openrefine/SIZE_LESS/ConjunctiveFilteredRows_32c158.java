```java
if (!_rowFilters.stream().allMatch(rowFilter -> rowFilter.filterRow(project, rowIndex, row))) {
    return false;
}
```