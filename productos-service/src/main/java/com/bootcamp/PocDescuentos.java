package com.bootcamp;

import org.springframework.stereotype.Component;

@Component
public class PocDescuentos {

    public double calcularDescuento(double precioProducto, double descuento) {
        double result = 0d;
        if (precioProducto > 0 && descuento > 0) {
            if (descuento <= precioProducto) {
                result = precioProducto - descuento;
            } else {
                System.out.println("Existe un Error, el descuento no puede ser mayor al precio del producto");
            }

        } else {
            System.out.println("Existe un Error, los montos no pueden ser 0 o numeros negativos");
        }

        return result;
    }

}
