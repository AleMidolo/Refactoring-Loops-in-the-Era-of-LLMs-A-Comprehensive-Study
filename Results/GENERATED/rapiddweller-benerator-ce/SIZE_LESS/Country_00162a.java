statesToAdd.forEach(state -> {
    state.setCountry(this);
    this.addState(state);
});