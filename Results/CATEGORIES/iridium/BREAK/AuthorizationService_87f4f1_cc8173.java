for (String secret : secrets) {
    if (encoder.matches(decodedValues[1], secret)) {
        isNotAuthorized = false;
        break;
    }
}