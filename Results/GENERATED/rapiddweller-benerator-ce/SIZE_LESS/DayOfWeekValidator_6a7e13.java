```java
Arrays.stream(params.daysOfWeekAccepted())
        .map(dayOfWeek -> isoDayOfWeek(dayOfWeek) - 1)
        .forEach(index -> daysOfWeekAccepted[index] = true);
```