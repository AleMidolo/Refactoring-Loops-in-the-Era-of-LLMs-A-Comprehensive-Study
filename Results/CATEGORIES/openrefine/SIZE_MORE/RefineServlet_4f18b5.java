for (ClassMapping m : classMappings) {
    if (m.from.endsWith("*")) {
        if (toClassName.startsWith(m.from.substring(0, m.from.length() - 1))) {
            toClassName = m.to + toClassName.substring(m.from.length() - 1);
        }
    } else {
        if (m.from.equals(toClassName)) {
            toClassName = m.to;
        }
    }
}