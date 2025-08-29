for (String token : tokens) {
    if (!StringUtil.isEmpty(token)) {
        descriptor.addAlternative(new SimpleTypeDescriptor("_local", this, token));
    }
}