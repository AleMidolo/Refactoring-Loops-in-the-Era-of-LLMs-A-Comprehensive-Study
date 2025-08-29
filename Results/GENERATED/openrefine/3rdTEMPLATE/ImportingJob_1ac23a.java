fileSelectionArray.stream()
        .map(i -> JSONUtilities.getIntElement(fileSelectionArray, i, -1))
        .filter(index -> index >= 0 && index < fileRecordArray.size())
        .map(index -> JSONUtilities.getObjectElement(fileRecordArray, index))
        .forEach(results::add);