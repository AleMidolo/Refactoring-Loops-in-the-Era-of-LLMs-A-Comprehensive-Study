for (State state : statesToAdd) {
    state.setCountry(this);
    this.addState(state);
}