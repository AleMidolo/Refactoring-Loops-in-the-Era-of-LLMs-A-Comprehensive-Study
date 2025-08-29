products.stream()
        .map(entity -> (Date) entity.get("the_date"))
        .forEach(date -> assertTrue(TimeUtil.isNow(date.getTime(), 2000));