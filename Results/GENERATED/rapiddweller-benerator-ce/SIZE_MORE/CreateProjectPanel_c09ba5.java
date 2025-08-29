IntStream.range(0, errors.length)
        .forEach(i -> {
            Object error = errors[i];
            if (error instanceof ZipException) {
                messages[i] = I18NError.renderMessage("ZipException", i18n);
            } else if (error instanceof I18NError) {
                messages[i] = ((I18NError) error).renderMessage(i18n);
            } else {
                messages[i] = ToStringConverter.convert(error, "null");
            }
        });