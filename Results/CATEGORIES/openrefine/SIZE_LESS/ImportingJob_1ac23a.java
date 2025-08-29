for (int i = 0; i < fileSelectionArray.size(); i++) {
    int index = JSONUtilities.getIntElement(fileSelectionArray, i, -1);
    if (index >= 0 && index < fileRecordArray.size()) {
        results.add(JSONUtilities.getObjectElement(fileRecordArray, index));
    }
}