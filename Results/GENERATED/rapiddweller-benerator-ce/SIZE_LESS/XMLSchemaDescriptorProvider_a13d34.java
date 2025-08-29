tokens.stream()
      .filter(token -> !StringUtil.isEmpty(token))
      .forEach(token -> descriptor.addAlternative(new SimpleTypeDescriptor("_local", this, token)));