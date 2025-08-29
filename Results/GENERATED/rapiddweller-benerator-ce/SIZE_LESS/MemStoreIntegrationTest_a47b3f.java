orders.stream()
      .forEach(order -> {
          assertNotNull(order);
          assertEquals(index, order.get("id"));
          assertEquals(index + 2, order.get("prod_id"));
          index++;
      });