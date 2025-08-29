for (int i = 0; i < size(); i++) {
    HasFields o = this.get(i);
    l.add(i, o == null ? null : (HasFields) o.getField(name, bindings));
}