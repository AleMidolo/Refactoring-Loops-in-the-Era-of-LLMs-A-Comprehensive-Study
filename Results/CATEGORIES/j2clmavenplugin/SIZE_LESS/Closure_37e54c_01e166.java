for (Map.Entry<String, String> define : defines.entrySet()) {
    jscompArgs.add("--define");
    jscompArgs.add(define.getKey() + "=" + define.getValue());
}