content.chars()
        .mapToObj(i -> (char) i)
        .reduce(new RefactorResult(sb, new ArrayList<>(), false), (result, character) -> {
            if (result.isRun()) {
                return result.processCharacter(character);
            } else if (character == '<' && (result.getIndex() + 4) < content.length()) {
                String tag = content.substring(result.getIndex(), result.getIndex() + 4);
                if (tag.equals(ph_open)) {
                    if (result.getSb().length() > 0) {
                        result.getParts().add(escape(result.getSb().toString()));
                    }
                    result.getSb().setLength(0);
                    result.getSb().append(ph_open);
                    int temp = result.getIndex() + ph_open.length();
                    boolean run = true;
                    while (run && temp < content.length()) {
                        boolean isSelfClosing = false;
                        boolean isClosing = false;
                        if (content.length() >= (temp + ph_self_close.length())) {
                            isSelfClosing = content.substring(temp, temp + ph_self_close.length()).equals(ph_self_close);
                        }
                        if (content.length() >= (temp + ph_close.length())) {
                            isClosing = content.substring(temp, temp + ph_close.length()).equals(ph_close);
                        }
                        if (isSelfClosing || isClosing) {
                            result.getSb().append(isSelfClosing ? ph_self_close : ph_close);
                            result.getParts().add(result.getSb().toString());
                            result.setIndex(result.getIndex() + result.getSb().length() - 1);
                            run = false;
                            result.getSb().setLength(0);
                        } else {
                            char current = content.charAt(temp);
                            result.getSb().append(current);
                            temp++;
                        }
                    }
                    return result.setRun(false);
                } else {
                    result.getSb().append(character);
                    return result;
                }
            } else {
                result.getSb().append(character);
                return result;
            }
        }, (r1, r2) -> {
            throw new UnsupportedOperationException("Not supported");
        });
        
static class RefactorResult {
    private final StringBuilder sb;
    private final List<String> parts;
    private final boolean run;
    private int index;

    public RefactorResult(StringBuilder sb, List<String> parts, boolean run) {
        this.sb = sb;
        this.parts = parts;
        this.run = run;
        this.index = 0;
    }

    public StringBuilder getSb() {
        return sb;
    }

    public List<String> getParts() {
        return parts;
    }

    public boolean isRun() {
        return run;
    }

    public int getIndex() {
        return index;
    }

    public RefactorResult setRun(boolean run) {
        return new RefactorResult(sb, parts, run);
    }

    public RefactorResult setIndex(int index) {
        this.index = index;
        return this;
    }

    public RefactorResult processCharacter(char character) {
        RefactorResult result = new RefactorResult(new StringBuilder(sb), new ArrayList<>(parts), run);
        result.getSb().append(character);
        return result;
    }
}