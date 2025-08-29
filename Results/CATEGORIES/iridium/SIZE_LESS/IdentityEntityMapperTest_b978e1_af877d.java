for (String tenantIdResponse : response.getTenantIds()) {
    assertThat(tenantIdResponse, is(equalTo(tenantId)));
}