for (int i = 0; i < pattern.length(); i++) {
    char c = pattern.charAt(i);
    switch(c) {
        case 'c':
            toAppendTo.append(number.getCountryCode());
            break;
        case 'a':
            toAppendTo.append(number.getAreaCode());
            break;
        case 'l':
            toAppendTo.append(number.getLocalNumber());
            break;
        default:
            toAppendTo.append(c);
    }
}