for (int i = 0; i != v.size(); i++) {
    result[i] = JsonValueConverter.convertComparable(v.get(i));
}