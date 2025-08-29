for (Map.Entry<String, String> entry : props.entrySet()) {
    builder.add(new String[] { entry.getKey(), entry.getValue() });
}