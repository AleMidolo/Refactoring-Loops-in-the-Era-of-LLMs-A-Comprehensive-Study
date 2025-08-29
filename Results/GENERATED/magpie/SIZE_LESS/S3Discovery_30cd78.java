metrics.stream()
        .collect(Collectors.toMap(dp -> dp.timestamp().toString(), Datapoint::sum));