for (int i = 0; i < n; i++) {
    ProductWrapper<?> tmp = generator.generate(wrapper);
    if (tmp == null) {
        printer.printStd("<>");
        return;
    } else {
        printer.printStd(formatter.convert(tmp.unwrap()));
    }
}