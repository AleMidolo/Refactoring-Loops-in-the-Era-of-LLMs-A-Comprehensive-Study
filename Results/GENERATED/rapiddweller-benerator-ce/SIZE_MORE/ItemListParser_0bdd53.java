XMLUtil.getChildElements(element).stream()
    .forEach(childElement -> {
        String childElementNodeName = childElement.getNodeName();
        if (!childElementNodeName.equals(EL_ITEM)) {
            throw BeneratorExceptionFactory.getInstance().configurationError("Expected element name: " + EL_ITEM + ". Found: " + childElementNodeName);
        }
        String itemName = childElement.getLocalName() + count++;
        ItemElementDescriptor itemElementDescriptor = new ItemElementDescriptor(itemName, descriptorProvider, null, new ComplexTypeDescriptor(localTypeName + "." + itemName, descriptorProvider, (ComplexTypeDescriptor) null));
        resultDescriptor.addComponent(itemElementDescriptor);
        parseItem(childElement, (ComplexTypeDescriptor) itemElementDescriptor.getLocalType());
    });