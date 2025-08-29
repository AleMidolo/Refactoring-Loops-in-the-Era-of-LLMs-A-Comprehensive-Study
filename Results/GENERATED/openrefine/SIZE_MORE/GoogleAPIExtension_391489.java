parts.stream()
     .filter(part -> part.startsWith("id=") || part.startsWith("key="))
     .forEach(part -> {
         if (part.startsWith("id=")) {
             offset = ("id=").length();
             keyOrId = part.substring(offset);
             numParts = 4;
         } else if (part.startsWith("key=")) {
             offset = ("key=").length();
             keyOrId = part.substring(offset);
             if (!keyOrId.isEmpty()) {
                 return keyOrId;
             }
             numParts = 2;
         }
     });