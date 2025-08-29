IntStream.range(0, domainSpecs.length)
         .mapToObj(i -> {
             String domainSpec = domainSpecs[i];
             return findDescriptorForDomain(domainSpec);
         })
         .toArray(String[]::new);