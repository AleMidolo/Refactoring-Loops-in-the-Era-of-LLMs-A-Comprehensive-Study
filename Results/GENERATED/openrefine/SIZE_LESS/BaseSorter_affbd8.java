Arrays.stream(_comparatorWrappers)
        .filter(wrapper -> c == 0)
        .findFirst()
        .ifPresent(wrapper -> c = wrapper.compare(project, o1, i1, o2, i2));