```java
this.components.entrySet()
        .forEach(component -> component.setValue(copyOrSelf(component.getValue())));
```