properties.stream()
    .forEach(property -> {
        switch(property.getName()) {
            case "familyName" ->
                assertThat(property.getValue(), is(equalTo(familyName));
            case "name" ->
                assertThat(property.getValue(), is(equalTo(name)));
            case "picture" ->
                assertThat(property.getValue(), is(equalTo(picture)));
            case "givenName" ->
                assertThat(property.getValue(), is(equalTo(givenName)));
            case "hd" ->
                assertThat(property.getValue(), is(equalTo(hd)));
            case "verifiedEmail" ->
                assertThat(property.getValue(), is(equalTo("true")));
            default ->
                throw new RuntimeException("Property doesn't match expected: " + property.getName());
        }
    });