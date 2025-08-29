for (int i = 0; i < val.getArraySize(); i++) {
    out[i] = value2JavaConverter(val.getArrayElement(i), referenceMap, depth + 1);
}