resources.stream()
    .skip(1)
    .filter(resource -> !(resource instanceof ConsumerChain))
    .forEach(IOUtil::close);