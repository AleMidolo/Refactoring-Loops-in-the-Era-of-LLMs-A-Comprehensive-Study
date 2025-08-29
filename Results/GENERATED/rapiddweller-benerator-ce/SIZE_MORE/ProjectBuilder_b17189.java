descs.stream()
     .filter(descriptor -> descriptor instanceof ComplexTypeDescriptor)
     .map(descriptor -> (ComplexTypeDescriptor) descriptor)
     .map(complexType -> {
         String name = complexType.getName();
         InstanceDescriptor iDesc = new InstanceDescriptor(name, database, complexType);
         if (setup.getDbSnapshot() != null) {
             iDesc.setCount(ExpressionUtil.constant(0L));
         } else {
             iDesc.setCount(ExpressionUtil.constant(database.countEntities(name)));
         }
         return iDesc;
     })
     .forEach(iDesc -> generateTable(iDesc, writer));