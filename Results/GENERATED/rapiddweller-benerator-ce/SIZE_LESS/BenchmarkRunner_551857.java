xml = types.stream()
            .map(type -> dialect.getSpecialType(type))
            .reduce(xml, (result, specialType) -> result.replace("{" + types + "}", specialType));