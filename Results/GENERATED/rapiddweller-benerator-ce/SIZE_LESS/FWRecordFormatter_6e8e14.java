converters.stream()
          .map(converter -> converter.convert(entity))
          .forEach(printer::print);