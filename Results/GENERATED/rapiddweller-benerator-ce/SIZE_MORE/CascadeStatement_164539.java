tableDescriptor.getParts().stream()
        .filter(component -> component instanceof ReferenceDescriptor)
        .map(component -> (ReferenceDescriptor) component)
        .forEach(fk -> {
            String refereeTableName = fk.getTargetType();
            Object sourceRef = entity.get(fk.getName());
            if (sourceRef != null) {
                IdentityProvider identityProvider = parent.getIdentityProvider();
                IdentityModel sourceIdentity = identityProvider.getIdentity(refereeTableName, false);
                if (sourceIdentity == null) {
                    DBTable refereeTable = source.getDbMetaData().getTable(refereeTableName);
                    sourceIdentity = new NoIdentity(refereeTable.getName());
                    identityProvider.registerIdentity(sourceIdentity, refereeTableName);
                }
                boolean needsNkMapping = parent.needsNkMapping(refereeTableName);
                if (sourceIdentity instanceof NoIdentity && needsNkMapping) {
                    throw BeneratorExceptionFactory.getInstance().configurationError("No identity defined for table " + refereeTableName);
                }
                KeyMapper mapper = parent.getKeyMapper();
                Object targetRef;
                if (needsNkMapping) {
                    String sourceRefNK = mapper.getNaturalKey(source.getId(), sourceIdentity, sourceRef);
                    targetRef = mapper.getTargetPK(sourceIdentity, sourceRefNK);
                } else {
                    targetRef = mapper.getTargetPK(source.getId(), sourceIdentity, sourceRef);
                }
                if (targetRef == null) {
                    String message = "No mapping found for " + source.getId() + '.' + refereeTableName + "#" + sourceRef + " referred in " + entity.type() + "(" + fk.getName() + "). " + "Probably has not been in the result set of the former '" + refereeTableName + "' nk query.";
                    getErrorHandler(context).handleError(message);
                }
                entity.setComponent(fk.getName(), targetRef);
            }
        });