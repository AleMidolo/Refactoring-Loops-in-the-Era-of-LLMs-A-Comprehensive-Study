for (Edit edit : _edits) {
    for (String s : edit.from) {
        fromTo.put(s, edit.to);
    }
    if (edit.fromBlank) {
        fromBlankTo = edit.to;
    }
    if (edit.fromError) {
        fromErrorTo = edit.to;
    }
}