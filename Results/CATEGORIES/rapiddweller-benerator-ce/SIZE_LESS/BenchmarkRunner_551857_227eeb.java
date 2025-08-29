for (String type : types) {
    String specialType = dialect.getSpecialType(type);
    xml = xml.replace('{' + type + '}', specialType);
}