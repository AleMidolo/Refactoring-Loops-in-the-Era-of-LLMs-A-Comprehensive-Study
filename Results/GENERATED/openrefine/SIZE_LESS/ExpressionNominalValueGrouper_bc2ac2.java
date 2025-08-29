counts = choiceValues.stream()
                        .map(this::getChoiceValueCount)
                        .collect(Collectors.toList());