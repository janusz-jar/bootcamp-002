package com.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
    void debeCambiarElEstadoDespuesDeCalcularElIva() {
        HistorialIva historial = mock(HistorialIva.class);
        PocIva pocIva = new PocIva(historial);

        pocIva.calcular(100.0);

        assertEquals(16.0, pocIva.getUltimoIvaCalculado(), 0.001);
    }

    @Test
    void debeInteractuarConElHistorialDespuesDeCalcularElIva() {
        HistorialIva historial = mock(HistorialIva.class);
        PocIva pocIva = new PocIva(historial);

        pocIva.calcular(100.0);

        verify(historial).guardar(100.0, 16.0);
    }



}
