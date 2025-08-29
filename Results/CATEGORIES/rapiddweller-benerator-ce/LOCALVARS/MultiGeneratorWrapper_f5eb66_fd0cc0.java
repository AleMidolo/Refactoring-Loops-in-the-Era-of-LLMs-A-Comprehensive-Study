for (int i = 0; i < sources.size(); i++) {
    elementWrapper = sources.get(i).generate(elementWrapper);
    if (elementWrapper == null) {
        return null;
    }
    S product = (S) elementWrapper.unwrap();
    result[i] = product;
}