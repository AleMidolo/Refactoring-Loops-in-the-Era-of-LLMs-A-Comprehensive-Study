XMLUtil.getChildElements(appInfo).stream()
    .forEach(child -> {
        String childName = XMLUtil.localName(child);
        if (INCLUDE.equals(childName)) {
            IncludeStatement statement = (IncludeStatement) new IncludeParser().parse(child, null, null, new BeneratorParseContext(this));
            statement.execute(context);
        } else if ("bean".equals(childName)) {
            Expression<?> constructionExpression = BeanParser.parseBeanExpression(child, true);
            String id = child.getAttribute("id");
            BeanStatement beanStatement = new BeanStatement(id, constructionExpression, this);
            try {
                beanStatement.execute(context);
            } finally {
                IOUtil.close(beanStatement);
            }
        } else {
            throw ExceptionFactory.getInstance().syntaxErrorForXmlElement("Document annotation type not supported", child);
        }
    });