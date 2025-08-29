sb.append(
    _args.stream()
         .map(Evaluable::toString)
         .collect(Collectors.joining(", "))
);