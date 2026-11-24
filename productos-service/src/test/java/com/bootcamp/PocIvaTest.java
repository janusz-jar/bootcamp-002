package com.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PocIvaTest {

    @Test
    void shouldCalculateIvaCorrectly() {
        double valor_producto = 100.0;
        PocIva helper = new PocIva(16.0);
        double iva_calculado = helper.calculaIva(valor_producto);
        assertEquals(16.0, iva_calculado);
    }

    @Test
    void debeActualizarElPrecioConIva() {
        
        PocIva helper = new PocIva(16.0);
        double producto = 100.0;

       double iva = helper.calculaIva(producto);

        assertEquals(116.0, producto+iva, 0.01);
    }

   
    

}
