profile = Arrays.stream(path)
    .reduce(profile, (p, s) -> p.getOrCreateSubProfile(s), (p1, p2) -> p2);