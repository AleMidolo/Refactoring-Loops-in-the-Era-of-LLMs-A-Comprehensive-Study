IntStream.range(0, instances.length)
    .forEach(i -> {
        if (i > 0) {
            builder.append(",");
        }
        builder.append("'").append(instances[i]).append("'");
    });