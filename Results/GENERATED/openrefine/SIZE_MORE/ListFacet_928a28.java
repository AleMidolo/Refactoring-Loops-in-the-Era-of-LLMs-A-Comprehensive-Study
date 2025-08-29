_config.selection.stream()
    .map(decoratedValue -> decoratedValue.value.toString())
    .filter(valueString -> grouper.choices.containsKey(valueString))
    .forEach(valueString -> grouper.choices.get(valueString).selected = true);

_config.selection.stream()
    .map(decoratedValue -> decoratedValue.value.toString())
    .filter(valueString -> !grouper.choices.containsKey(valueString))
    .forEach(valueString -> {
        NominalFacetChoice choice = new NominalFacetChoice(decoratedValue);
        choice.count = 0;
        choice.selected = true;
        _choices.add(choice);
    });