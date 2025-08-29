summaries.stream()
    .forEach(summary -> {
        if (summary.getId().equals(tenantOneId)) {
            assertThat(summary.getSubdomain(), is(equalTo(tenantOneSubdomain));
        } else if (summary.getId().equals(tenantTwoId)) {
            assertThat(summary.getSubdomain(), is(equalTo(tenantTwoSubdomain));
        } else {
            throw new RuntimeException("mismatching tenant ids");
        }
    });