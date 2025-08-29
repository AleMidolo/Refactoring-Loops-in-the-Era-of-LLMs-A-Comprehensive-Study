for (int i = 0; i < length && wrapper != null; i++) {
    writer.setVariable("part_index", i);
    wrapper = generator.generate(wrapper);
    if (wrapper != null) {
        writer.writeElement(wrapper.unwrap());
    }
}