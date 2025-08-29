for (int i = 0; i < maxCount || maxCount <= 0; i++) {
    wrapper = generator.generate(wrapper);
    if (wrapper != null) {
        result.add(wrapper.unwrap());
    } else {
        return result;
    }
}