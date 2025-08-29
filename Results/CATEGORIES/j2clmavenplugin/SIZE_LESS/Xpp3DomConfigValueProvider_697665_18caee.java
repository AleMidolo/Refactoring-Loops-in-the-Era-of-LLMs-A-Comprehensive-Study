for (int i = 0; i < children.length; i++) {
    Xpp3Dom xpp3Dom = children[i];
    Xpp3DomConfigNode xpp3DomConfigNode = new Xpp3DomConfigNode(getPath() + "[" + i + "]" + xpp3Dom.getName(), xpp3Dom);
    list.add(xpp3DomConfigNode);
}