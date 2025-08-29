for (Entity entity : products) {
    assertTrue(TimeUtil.isNow(((Date) entity.get("the_date")).getTime(), 2000));
}