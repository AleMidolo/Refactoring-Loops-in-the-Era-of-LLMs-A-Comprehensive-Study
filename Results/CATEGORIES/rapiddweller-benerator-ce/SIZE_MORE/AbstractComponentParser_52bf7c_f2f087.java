for (Map.Entry<String, String> entry : attributes.entrySet()) {
    String detailName = entry.getKey();
    if (detailName.equals("type")) {
        continue;
    }
    Object tmp = resolveScript(detailName, entry.getValue(), context);
    String detailString = ToStringConverter.convert(tmp, null);
    if (descriptor.supportsDetail(detailName)) {
        try {
            descriptor.setDetailValue(detailName, detailString);
        } catch (IllegalArgumentException e) {
            throw BeneratorExceptionFactory.getInstance().syntaxErrorForText(detailString, "Error parsing '" + detailName + "'");
        }
    } else {
        if (localType == null) {
            String partType = attributes.get("type");
            if (partType == null) {
                partType = descriptor.getType();
            }
            if (partType == null) {
                String sourceSpec = attributes.get("source");
                if (sourceSpec != null) {
                    Object source = context.get(sourceSpec);
                    if (source != null) {
                        if (source instanceof Generator) {
                            if (((Generator<?>) source).getGeneratedType() == Entity.class) {
                                partType = ENTITY;
                            }
                        } else if (source instanceof EntitySource) {
                            partType = ENTITY;
                        }
                    } else {
                        String lcSourceSpec = sourceSpec.toLowerCase();
                        if (lcSourceSpec.endsWith(".ent.csv") || lcSourceSpec.endsWith(".ent.fcw") || lcSourceSpec.endsWith(".dbunit.xml")) {
                            partType = ENTITY;
                        }
                    }
                }
            }
            if (partType != null) {
                TypeDescriptor localTypeParent = context.getDataModel().getTypeDescriptor(partType);
                localType = (localTypeParent instanceof ComplexTypeDescriptor ? new ComplexTypeDescriptor(partType, descriptorProvider, partType) : new SimpleTypeDescriptor(partType, descriptorProvider, partType));
            }
            descriptor.setLocalType(localType);
        }
        if (localType == null) {
            localType = descriptor.getLocalType(complexType);
        }
        localType.setDetailValue(detailName, detailString);
    }
}