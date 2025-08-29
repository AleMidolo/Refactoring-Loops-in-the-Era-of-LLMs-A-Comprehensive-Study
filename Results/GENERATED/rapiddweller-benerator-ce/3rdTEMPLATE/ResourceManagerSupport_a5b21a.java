resources.stream()
        .filter(resource -> !(resource instanceof ConsumerChain))
        .forEach(resource -> IOUtil.close(resource));