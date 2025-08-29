summaries.stream()
        .filter(summary -> summary.getId().equals(tenantOneId) || summary.getId().equals(tenantTwoId))
        .forEach(summary -> {
            if (summary.getId().equals(tenantOneId)) {
                assertThat(summary.getSubdomain(), is(equalTo(tenantOneSubdomain)));
            } else {
                assertThat(summary.getSubdomain(), is(equalTo(tenantTwoSubdomain)));
            }
        });