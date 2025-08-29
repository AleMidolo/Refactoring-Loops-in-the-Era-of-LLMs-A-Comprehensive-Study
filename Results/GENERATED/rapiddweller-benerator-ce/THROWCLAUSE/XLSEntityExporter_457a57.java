getComponents(entity).entrySet().stream()
    .forEach(component -> {
        String componentName = component.getKey();
        headerRow.createCell(colnum).setCellValue(new HSSFRichTextString(componentName));
        ComponentDescriptor cd = entity.descriptor().getComponent(componentName);
        PrimitiveType primitiveType;
        if (cd.getTypeDescriptor() instanceof SimpleTypeDescriptor) {
            primitiveType = ((SimpleTypeDescriptor) cd.getTypeDescriptor()).getPrimitiveType();
        } else {
            throw BeneratorExceptionFactory.getInstance().illegalOperation("Can only export simple type attributes, " + "failed to export " + entity.type() + '.' + cd.getName());
        }
        Class<?> javaType = (primitiveType != null ? primitiveType.getJavaType() : String.class);
        String formatString = null;
        if (BeanUtil.isIntegralNumberType(javaType)) {
            formatString = getIntegralPattern();
        } else if (BeanUtil.isDecimalNumberType(javaType)) {
            formatString = getDecimalPattern();
        } else if (Time.class.isAssignableFrom(javaType)) {
            formatString = getTimePattern();
        } else if (Timestamp.class.isAssignableFrom(javaType)) {
            formatString = getTimestampPattern();
        } else if (Date.class.isAssignableFrom(javaType)) {
            formatString = getDatePattern();
        }
        if (formatString != null) {
            HSSFDataFormat dataFormat = workbook.createDataFormat();
            CellStyle columnStyle = workbook.createCellStyle();
            columnStyle.setDataFormat(dataFormat.getFormat(formatString));
            sheet.setDefaultColumnStyle(colnum, columnStyle);
        }
        colnum++;
    });