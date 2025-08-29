defines.entrySet().stream()
    .forEach(define -> {
        jscompArgs.add("--define");
        jscompArgs.add(define.getKey() + "=" + define.getValue());
    });