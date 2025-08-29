Arrays.stream(products)
    .reduce(wrapper, (w, expectedProduct) -> {
        Wrapper<T> wrapper = generator.generate(w);
        assertNotNull("Generator is unavailable after generating " + count + " of " + products.length + " products: " + generator, wrapper);
        T generatedProduct = wrapper.unwrap();
        if (generatedProduct.getClass().isArray()) {
            assertEqualArrays(expectedProduct, generatedProduct);
        } else {
            assertEquals(expectedProduct, generatedProduct);
        }
        count++;
        return wrapper;
    }, (a, b) -> a);