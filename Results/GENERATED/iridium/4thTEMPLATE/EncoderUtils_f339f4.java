IntStream.range(0, length)
    .mapToObj(i -> (int) (secureRandom.nextDouble() * characterChoices.length()))
    .forEach(index -> sb.append(characterChoices.charAt(index)));