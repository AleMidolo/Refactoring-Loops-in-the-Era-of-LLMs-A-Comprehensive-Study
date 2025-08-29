Arrays.stream(dataFilenames)
    .forEach(filename -> parseFile(filename, separator, encoding, converter, samples));