response.getRoles().stream()
        .forEach(domainRoleName -> assertThat(domainRoleName, is(equalTo(roleName)));