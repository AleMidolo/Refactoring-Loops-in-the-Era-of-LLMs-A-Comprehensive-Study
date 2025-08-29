parentConstructors.stream()
        .map(ct -> {
            CtConstructor constructor = new CtConstructor(ct.getParameterTypes(), newClass);
            String body = String.format("{super($1); this.setType(\"%s\"); }", type);
            constructor.setBody(body);
            return constructor;
        })
        .forEach(newClass::addConstructor);