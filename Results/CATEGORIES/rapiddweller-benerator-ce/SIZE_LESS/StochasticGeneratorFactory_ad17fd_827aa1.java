for (int i = 0; i < samples.length; i++) {
    T rawValue = samples[i].getValue();
    String value = ToStringConverter.convert(rawValue, null);
    values[i] = value;
}