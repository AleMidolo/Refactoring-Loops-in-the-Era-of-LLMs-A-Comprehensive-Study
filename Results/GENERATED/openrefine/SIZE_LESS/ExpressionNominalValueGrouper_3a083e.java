IntStream.range(0, count)
            .mapToObj(i -> getChoiceValueCount(choiceValues.get(i)))
            .forEach(counts::add);