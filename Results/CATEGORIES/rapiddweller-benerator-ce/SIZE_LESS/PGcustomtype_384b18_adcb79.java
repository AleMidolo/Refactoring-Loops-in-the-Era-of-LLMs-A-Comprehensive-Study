for (CtConstructor ct : parentConstructors) {
    CtConstructor constructor = new CtConstructor(ct.getParameterTypes(), newClass);
    String body = String.format("{super($1); this.setType(\"%s\"); }", type);
    constructor.setBody(body);
    newClass.addConstructor(constructor);
}