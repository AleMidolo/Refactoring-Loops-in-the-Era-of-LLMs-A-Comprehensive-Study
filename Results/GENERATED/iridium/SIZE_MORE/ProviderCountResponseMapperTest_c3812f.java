responses.stream()
        .forEach(response -> {
            if (response.getName().equals("GitHub")) {
                assertThat(response.getValue(), is(equalTo(2)));
            } else if (response.getName().equals("Google")) {
                assertThat(response.getValue(), is(equalTo(1)));
            } else {
                throw new RuntimeException("Unexpected provider found");
            }
        });