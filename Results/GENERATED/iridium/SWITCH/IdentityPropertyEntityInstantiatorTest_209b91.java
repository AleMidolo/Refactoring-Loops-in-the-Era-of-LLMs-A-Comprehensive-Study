properties.stream()
    .forEach(property -> {
        switch(property.getName()) {
            case "avatarUrl" ->
                assertThat(property.getValue(), is(equalTo(avatarUrl)));
            case "login" ->
                assertThat(property.getValue(), is(equalTo(login)));
            case "name" ->
                assertThat(property.getValue(), is(equalTo(name)));
            case "email" ->
                assertThat(property.getValue(), is(equalTo(email)));
            default ->
                throw new RuntimeException("Property doesn't match expected: " + property.getName());
        }
    });