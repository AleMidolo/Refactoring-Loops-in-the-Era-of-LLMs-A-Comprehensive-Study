for (int i = 0; i < length; i++) {
    int index = (int) (secureRandom.nextDouble() * characterChoices.length());
    sb.append(characterChoices.charAt(index));
}