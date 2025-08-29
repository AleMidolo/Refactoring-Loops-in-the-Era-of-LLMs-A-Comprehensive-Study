Arrays.stream(target.getClass().getDeclaredMethods())
        .filter(m -> m.getParameterCount() == 0)
        .filter(m -> !m.getName().endsWith("Async"))
        .filter(m -> Modifier.isPublic(m.getModifiers()))
        .filter(m -> interests.stream().anyMatch(p -> p.matcher(m.getName()).matches()))
        .filter(m -> nonInterests.stream().noneMatch(p -> p.matcher(m.getName()).matches()))
        .collect(Collectors.toList())
        .forEach(method -> {
            try {
                method.setAccessible(true);
                final var res = method.invoke(target);
                if (res instanceof String || res instanceof Boolean || res instanceof Number) {
                    map.put(method.getName(), res);
                } else {
                    map.put(method.getName(), mapper.valueToTree(res));
                }
            } catch (Exception ex) {
                logger.info("Couldn't add method {}", method.getName(), ex);
            }
        });