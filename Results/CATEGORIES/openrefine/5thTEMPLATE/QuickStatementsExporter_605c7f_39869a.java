for (Snak s : sg.getSnaks()) {
    if (reference) {
        writer.write(s.accept(referenceSnakPrinter));
    } else {
        writer.write(s.accept(mainSnakPrinter));
    }
}