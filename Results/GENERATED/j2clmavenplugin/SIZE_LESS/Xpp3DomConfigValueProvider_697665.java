IntStream.range(0, children.length)
    .mapToObj(i -> {
        Xpp3Dom xpp3Dom = children[i];
        return new Xpp3DomConfigNode(getPath() + "[" + i + "]" + xpp3Dom.getName(), xpp3Dom);
    })
    .forEach(list::add);