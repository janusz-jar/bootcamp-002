package com.bootcamp;

import org.springframework.stereotype.Component;

@Component
public class PocIva {

    public final double IVA_VALOR;



    public PocIva(double iVA_VALOR) {
        IVA_VALOR = iVA_VALOR;
    }


    public double calculaIva(double precio) {
        return (precio * IVA_VALOR)/100;
    }

}