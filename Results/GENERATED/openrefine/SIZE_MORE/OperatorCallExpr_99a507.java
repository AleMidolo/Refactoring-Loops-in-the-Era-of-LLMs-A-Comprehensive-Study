_sb.stream()
   .map(Evaluable::toString)
   .collect(Collectors.joining(" " + _op + " "));