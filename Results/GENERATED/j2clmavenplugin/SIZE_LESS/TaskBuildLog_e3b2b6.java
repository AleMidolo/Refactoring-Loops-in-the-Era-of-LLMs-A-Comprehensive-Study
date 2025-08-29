elts.stream()
    .forEach(elt -> {
        logFilePrintStream.print(prefix);
        logFilePrintStream.print(indent);
        logFilePrintStream.print("\tat ");
        logFilePrintStream.println(elt);
    });