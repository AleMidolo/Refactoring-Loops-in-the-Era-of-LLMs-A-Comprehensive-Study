List<FileConfigNode> nodes = IntStream.range(0, list.size())
        .mapToObj(i -> new FileConfigNode(getPath() + "[" + i + "]file", list.get(i)))
        .collect(Collectors.toList());