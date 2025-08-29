_edits.forEach(edit -> {
    edit.from.forEach(s -> fromTo.put(s, edit.to));
    if (edit.fromBlank) {
        fromBlankTo = edit.to;
    }
    if (edit.fromError) {
        fromErrorTo = edit.to;
    }
});