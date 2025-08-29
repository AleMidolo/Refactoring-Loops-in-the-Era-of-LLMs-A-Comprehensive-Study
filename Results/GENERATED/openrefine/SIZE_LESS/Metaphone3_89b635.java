```java
return Arrays.stream(compareStrings)
             .anyMatch(strFragment -> target.equals(strFragment));
```