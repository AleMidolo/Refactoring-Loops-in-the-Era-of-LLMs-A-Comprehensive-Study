IntStream.range(0, length)
    .mapToObj(i -> (int) (secureRandom.nextDouble() * characterChoices.length()))
    .mapToObj(characterChoices::charAt)
    .forEach(sb::append);