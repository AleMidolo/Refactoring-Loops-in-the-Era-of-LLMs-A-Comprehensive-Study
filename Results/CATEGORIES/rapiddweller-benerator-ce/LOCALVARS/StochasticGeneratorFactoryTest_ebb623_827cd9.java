for (int i = 0; i < 1000; i++) {
    Character c = generator.generate(wrapper).unwrap();
    int index = specialChars.indexOf(c);
    if (index >= 0) {
        specialCount[index]++;
    }
}