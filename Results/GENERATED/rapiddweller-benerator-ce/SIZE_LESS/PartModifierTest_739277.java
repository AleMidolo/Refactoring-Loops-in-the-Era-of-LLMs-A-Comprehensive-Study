cars.stream()
     .forEach(car -> assertEquals("BMW", car.get("maker")));