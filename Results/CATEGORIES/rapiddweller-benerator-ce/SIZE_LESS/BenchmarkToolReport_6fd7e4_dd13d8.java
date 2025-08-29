for (SystemRef candidate : config.getSystems()) {
    if (candidate.getType().equals(type)) {
        result.add(candidate);
    }
}