IntStream.range(0, n)
    .mapToObj(i -> generator.generate(wrapper))
    .findFirst(tmp -> {
        if (tmp == null) {
            printer.printStd("<>");
            return true;
        } else {
            printer.printStd(formatter.convert(tmp.unwrap()));
            return false;
        }
    });