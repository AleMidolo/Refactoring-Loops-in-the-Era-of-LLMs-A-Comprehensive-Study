```java
products.stream()
    .map(product -> (Date) product[0])
    .peek(date -> assertFalse(date.before(MIN_DATE)))
    .peek(date -> assertFalse(date.after(MAX_DATE)))
    .forEach(usedDates::add);
```