```java
parts.stream()
    .filter(part -> part.startsWith("id=") || (part.startsWith("key=") && !part.substring(4).isEmpty()))
    .findFirst()
    .ifPresent(part -> {
        if (part.startsWith("id=")) {
            offset = ("id=").length();
            keyOrId = part.substring(offset);
            numParts = 4;
        } else {
            offset = ("key=").length();
            keyOrId = part.substring(offset);
            numParts = 2;
        }
    });
```