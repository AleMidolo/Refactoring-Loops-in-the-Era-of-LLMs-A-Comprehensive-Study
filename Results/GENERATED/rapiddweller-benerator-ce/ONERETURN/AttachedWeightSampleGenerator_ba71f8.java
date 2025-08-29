return samples.stream()
               .anyMatch(sample -> NullSafeComparator.equals(searchedValue, sample.getValue()));