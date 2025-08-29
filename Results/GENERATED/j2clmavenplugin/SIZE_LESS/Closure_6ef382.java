externFiles.forEach(extern -> {
    jscompArgs.add("--externs");
    jscompArgs.add(extern);
});