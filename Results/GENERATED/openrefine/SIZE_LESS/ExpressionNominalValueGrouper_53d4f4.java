choiceValues.stream()
            .map(this::getChoiceValueCount)
            .forEach(counts::add);