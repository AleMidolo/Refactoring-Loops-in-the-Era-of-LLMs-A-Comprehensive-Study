for (Map.Entry<String, Object> component : input.getComponents().entrySet()) {
    String inCptName = component.getKey();
    String outCptName = (String) nameMapper.convert(inCptName);
    output.setComponent(outCptName, input.get(inCptName));
}