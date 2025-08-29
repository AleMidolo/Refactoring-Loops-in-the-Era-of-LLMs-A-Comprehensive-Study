for (MonolingualTextValue mltv : mltvs) {
    List<MonolingualTextValue> values = result.get(mltv.getLanguageCode());
    if (values == null) {
        values = new LinkedList<>();
        result.put(mltv.getLanguageCode(), values);
    }
    values.add(mltv);
}