package com.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    private final PocIva pociva;
      private final PocDescuentos pocDescuentos;

    public App(PocIva pociva, PocDescuentos pocDescuentos) {
        this.pociva = pociva;
        this.pocDescuentos = pocDescuentos;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public double ivaPanBimbo(){
        final  double precio_pan = 67.50;
        final double result = pociva.calculaIva(precio_pan);
        final double precio_sinIva = precio_pan - result;
        System.out.println("======================");
        System.out.println("Precio Producto:" + precio_sinIva );
        System.out.println("Precio Iva:" + result);
        System.out.println("Total:" + (precio_sinIva + result));
        System.out.println("======================");
        
        return result;
    }


        @Bean
    public double descuentoPanBimboCaducado(){
        final double precio_pan = 67.50;
        final double descuento = 22.00;
        final double result = pocDescuentos.calcularDescuento(precio_pan, 22.00);
        System.out.println("======================");
        System.out.println("Precio Producto:" + precio_pan );
        System.out.println("Descuento:" + descuento);
        System.out.println("Total:" + result);
        System.out.println("======================");
        
        return result;
    }

    
}
