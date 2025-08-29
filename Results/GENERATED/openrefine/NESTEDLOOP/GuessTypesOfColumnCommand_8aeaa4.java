IntStream.range(0, count)
         .forEach(j -> {
            ReconResult result = reconResults.get(j);
            double score = 1.0 / (1 + j);
            result.types.stream()
                         .forEach(type -> {
                            double score2 = score * (result.types.size() - result.types.indexOf(type)) / result.types.size();
                            map.compute(type.id, (key, val) -> val == null ? new TypeGroup(type.id, type.name, score2) : {val.score += score2; val.count++;});
                        });
        });