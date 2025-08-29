sg.getSnaks().stream()
    .forEach(s -> writer.write(reference ? s.accept(referenceSnakPrinter) : s.accept(mainSnakPrinter));