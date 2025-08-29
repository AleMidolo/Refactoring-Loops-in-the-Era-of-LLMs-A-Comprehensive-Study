for (WeightedSample<? extends E> sample : samples) {
    if (NullSafeComparator.equals(searchedValue, sample.getValue())) {
        return true;
    }
}