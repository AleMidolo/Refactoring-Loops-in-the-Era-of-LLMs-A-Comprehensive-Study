input.getComponents().entrySet().stream()
    .forEach(component -> {
        String inCptName = component.getKey();
        String outCptName = (String) nameMapper.convert(inCptName);
        output.setComponent(outCptName, input.get(inCptName));
    });