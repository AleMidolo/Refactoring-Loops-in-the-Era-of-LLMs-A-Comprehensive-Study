for (int i = 0; i < details.length; i += 2) {
    String detailName = (String) details[i];
    Object expectedValue = details[i + 1];
    Object actualValue;
    if (param1.supportsDetail(detailName)) {
        actualValue = param1.getDetailValue(detailName);
    } else {
        actualValue = param1.getTypeDescriptor().getDetailValue(detailName);
    }
    assertEquals(expectedValue, actualValue);
}