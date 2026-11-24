package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PocDescuentosTest {

    @InjectMocks
    private PocDescuentos pocDescuentos;

    @Test
    void shouldCalculateDiscountWhenAmountsAreValid() {
        // Given
        double precioProducto = 100.0d;
        double descuento = 20.0d;

        // When
        double result = pocDescuentos.calcularDescuento(
                precioProducto,
                descuento
        );

        // Then
        assertEquals(80.0d, result);
    }

    @Test
    void shouldReturnZeroWhenDiscountEqualsProductPrice() {
        // Given
        double precioProducto = 100.0d;
        double descuento = 100.0d;

        // When
        double result = pocDescuentos.calcularDescuento(
                precioProducto,
                descuento
        );

        // Then
        assertEquals(0.0d, result);
    }

    @Test
    void shouldReturnZeroWhenDiscountIsGreaterThanProductPrice() {
        // Given
        double precioProducto = 100.0d;
        double descuento = 101.0d;

        // When
        double result = pocDescuentos.calcularDescuento(
                precioProducto,
                descuento
        );

        // Then
        assertEquals(0.0d, result);
    }

    @Test
    void shouldReturnZeroWhenProductPriceIsZero() {
        // Given
        double precioProducto = 0.0d;
        double descuento = 20.0d;

        // When
        double result = pocDescuentos.calcularDescuento(
                precioProducto,
                descuento
        );

        // Then
        assertEquals(0.0d, result);
    }

    @Test
    void shouldReturnZeroWhenProductPriceIsNegative() {
        // Given
        double precioProducto = -100.0d;
        double descuento = 20.0d;

        // When
        double result = pocDescuentos.calcularDescuento(
                precioProducto,
                descuento
        );

        // Then
        assertEquals(0.0d, result);
    }

    @Test
    void shouldReturnZeroWhenDiscountIsZero() {
        // Given
        double precioProducto = 100.0d;
        double descuento = 0.0d;

        // When
        double result = pocDescuentos.calcularDescuento(
                precioProducto,
                descuento
        );

        // Then
        assertEquals(0.0d, result);
    }

    @Test
    void shouldReturnZeroWhenDiscountIsNegative() {
        // Given
        double precioProducto = 100.0d;
        double descuento = -20.0d;

        // When
        double result = pocDescuentos.calcularDescuento(
                precioProducto,
                descuento
        );

        // Then
        assertEquals(0.0d, result);
    }
}