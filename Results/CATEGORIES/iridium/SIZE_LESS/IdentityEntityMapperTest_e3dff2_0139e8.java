for (String domainRoleName : response.getRoles()) {
    assertThat(domainRoleName, is(equalTo(roleName)));
}