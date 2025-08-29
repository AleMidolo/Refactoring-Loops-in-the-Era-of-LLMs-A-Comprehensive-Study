childNodes.asList().stream()
          .filter(node -> node instanceof Element)
          .map(node -> (Element) node)
          .filter(element -> componentName.equals(normalizeName(element.getNodeName())))
          .forEach(element -> element.setTextContent(convertToString(componentValue)));