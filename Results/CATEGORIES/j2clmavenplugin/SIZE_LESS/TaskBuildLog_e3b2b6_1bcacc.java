for (StackTraceElement elt : elts) {
    logFilePrintStream.print(prefix);
    logFilePrintStream.print(indent);
    logFilePrintStream.print("\tat ");
    logFilePrintStream.println(elt);
}