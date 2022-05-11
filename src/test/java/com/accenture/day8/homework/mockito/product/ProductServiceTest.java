package com.accenture.day8.homework.mockito.product;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Test
    void testIfClassExists() {
        var productService = new ProductService();
    }
}
