XMLUtil.getChildElements(ifElement).stream()
        .map(Element::getNodeName)
        .forEach(childName -> {
            if (EL_THEN.equals(childName)) {
                if (thenUsed) {
                    throw BeneratorExceptionFactory.getInstance().syntaxErrorForXmlElement("Multiple <then> elements", null, BeneratorErrorIds.SYN_IF_THEN, ifElement);
                }
                thenUsed = true;
            } else if (EL_ELSE.equals(childName)) {
                if (!thenUsed) {
                    throw BeneratorExceptionFactory.getInstance().syntaxErrorForXmlElement("<else> without <then>", null, BeneratorErrorIds.SYN_IF_ELSE_WO_THEN, ifElement);
                } else if (elseUsed) {
                    throw BeneratorExceptionFactory.getInstance().syntaxErrorForXmlElement("Multiple <else> elements", null, BeneratorErrorIds.SYN_IF_ELSE, ifElement);
                }
                elseUsed = true;
            } else if (!plain && !EL_COMMENT.equals(childName)) {
                throw BeneratorExceptionFactory.getInstance().syntaxErrorForXmlElement("Illegal child element of <if>", null, BeneratorErrorIds.SYN_IF_ILLEGAL_CHILD, ifElement);
            }
        });