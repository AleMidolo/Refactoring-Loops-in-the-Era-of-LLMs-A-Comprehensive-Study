for (String secret : secrets) {
    if (secret.equals(clientSecret)) {
        isNotAuthorized = false;
        break;
    }
}