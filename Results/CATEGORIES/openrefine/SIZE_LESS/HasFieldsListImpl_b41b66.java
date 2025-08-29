for (int i = 0; i < r.length; i++) {
    HasFields o = this.get(i);
    r[i] = o == null ? null : o.getField(name, bindings);
}