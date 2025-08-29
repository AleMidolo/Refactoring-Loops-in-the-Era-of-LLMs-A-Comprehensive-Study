sg.getSnaks().stream()
    .map(s -> reference ? s.accept(referenceSnakPrinter) : s.accept(mainSnakPrinter))
    .forEach(writer::write);