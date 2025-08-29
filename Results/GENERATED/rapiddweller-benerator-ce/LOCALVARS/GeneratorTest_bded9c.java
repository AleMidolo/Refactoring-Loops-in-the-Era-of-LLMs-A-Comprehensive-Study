Arrays.stream(products)
    .forEach(expectedProduct -> {
        wrapper = generator.generate(wrapper);
        assertNotNull("Generator is unavailable after generating " + count + " of " + products.length + " products: " + generator, wrapper);
        T generatedProduct = wrapper.unwrap();
        if (generatedProduct.getClass().isArray()) {
            assertEqualArrays(expectedProduct, generatedProduct);
        } else {
            assertEquals(expectedProduct, generatedProduct);
        }
        count++;
    });