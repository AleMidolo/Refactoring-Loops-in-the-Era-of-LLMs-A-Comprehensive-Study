parts.stream()
     .filter(part -> part.startsWith("id=") || part.startsWith("key="))
     .findFirst()
     .ifPresent(part -> {
         if (part.startsWith("id=")) {
             offset = ("id=").length();
             keyOrId = part.substring(offset);
             numParts = 4;
         } else if (part.startsWith("key=")){
             offset = ("key=").length();
             keyOrId = part.substring(offset);
             if (!keyOrId.isEmpty()){
                 throw new RuntimeException(keyOrId);
             }
             numParts = 2;
         }
     });