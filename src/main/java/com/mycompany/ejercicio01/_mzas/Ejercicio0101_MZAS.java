/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio01._mzas;

/**
 *
 * @author alexa
 */
public class Ejercicio0101_MZAS {

    public static void main(String[] args) {
            //////////////////////////////////////////////
        var perrito = new Perro ();
        perrito.nombre="Manchas";
        var raza1 = new Perro();
        raza1.raza="Golden Retriever";
        var años1 = new Perro();
        años1.años=2;
        var peso1 = new Perro();
        peso1.peso=1.5f;

        var perrito2 = new Perro ();
        perrito2.nombre="Jack";
        var raza2 = new Perro();
        raza2.raza="French Poodle";
        var años2 = new Perro();
        años2.años=1;
        var peso2 = new Perro();
        peso2.peso=1.0f;
        
        System.out.println("El perrito se llama: " +perrito.nombre);
        System.out.println("El perrito es de raza: " +raza1.raza);
        System.out.println("El perrito tiene: " +años1.años +" años");
        System.out.println("El perrito pesa: " +peso1.peso +" kg");
        System.out.println("  ");
        
        System.out.println("El perrito se llama: " +perrito.nombre);
        System.out.println("El perrito es de raza: " +raza2.raza);
        System.out.println("El perrito tiene: " +años2.años +" años");
        System.out.println("El perrito pesa: " +peso2.peso +" kg");
        System.out.println("  ");
        //////////////////////////////////////////////
        
        //////////////////////////////////////////////
        var carrito = new Carro ();
        carrito.marca="Chevrolet";
        var modelito = new Carro();
        modelito.modelo="Aveo Family";
        var cilindraje1 = new Carro();
        cilindraje1.cilindraje=1500;
        var pesocarro1 = new Carro();
        pesocarro1.peso=1.139f;
        
        var carrito2 = new Carro ();
        carrito2.marca="Fiat";
        var modelito2 = new Carro();
        modelito2.modelo="124 Spider";
        var cilindraje2 = new Carro();
        cilindraje2.cilindraje=2500;
        var pesocarro2 = new Carro();
        pesocarro2.peso=1.125f;

        
        System.out.println("La marca del carro es: " +carrito.marca);
        System.out.println("El modelo es: " +modelito.modelo);
        System.out.println("El cilindraje es: " +cilindraje1.cilindraje + " cc");
        System.out.println("El modelo es: " +pesocarro1.peso +" kg");
        System.out.println("  ");
        
        System.out.println("La marca del carro es: " +carrito2.marca);
        System.out.println("El modelo es: " +modelito2.modelo);
        System.out.println("El cilindraje es: " +cilindraje2.cilindraje + " cc");
        System.out.println("El modelo es: " +pesocarro2.peso +" kg");
        System.out.println("  ");
        
        //////////////////////////////////////////////
        
        
         ////////////////////////////////////////////// 
        var bici1 = new Bicicleta ();
        bici1.marca="Giant";
        var modelobici1 = new Bicicleta();
        modelobici1.modelo="PROPEL ADVANCED SL DISC 1";
        var pesobici1 = new Bicicleta();
        pesobici1.peso=5f;
        var añobici1 = new Bicicleta();
        añobici1.año=2022;
        
        var bici2 = new Bicicleta ();
        bici2.marca="Santa Ana";
        var modelobici2 = new Bicicleta();
        modelobici2.modelo="California";
        var pesobici2 = new Bicicleta();
        pesobici2.peso=6f;
        var añobici2 = new Bicicleta();
        añobici2.año=2021;
        
        System.out.println("La marca del bicicleta es: " +bici1.marca);
        System.out.println("El modelo es: " +modelobici1.modelo);
        System.out.println("El peso es: " +pesobici1.peso + " kg");
        System.out.println("El año de fabricación es: " +añobici1.año);
        System.out.println("  ");
        
        System.out.println("La marca del bicicleta es: " +bici2.marca);
        System.out.println("El modelo es: " +modelobici2.modelo);
        System.out.println("El peso es: " +pesobici2.peso + " kg");
        System.out.println("El año de fabricación es: " +añobici2.año);
        System.out.println("  ");
        
        //////////////////////////////////////////////
        
        //////////////////////////////////////////////
        var compu1 = new Computadora ();
        compu1.marca="Toshiba";
        var modelocompu1 = new Computadora();
        modelocompu1.modelo="Satellite";
        var pesocompu1 = new Computadora();
        pesocompu1.peso=1.2f;
        var añocompu1 = new Computadora();
        añocompu1.año=2010;
        
        var compu2 = new Computadora ();
        compu2.marca="Acer";
        var modelocompu2 = new Computadora();
        modelocompu2.modelo="Aspire 3";
        var pesocompu2 = new Computadora();
        pesocompu2.peso=1.4f;
        var añocompu2 = new Computadora();
        añocompu2.año=2018;
        
        System.out.println("La marca de la computadora es: " +compu1.marca);
        System.out.println("El modelo es: " +modelocompu1.modelo);
        System.out.println("El peso es: " +pesocompu1.peso + " kg");
        System.out.println("El año de fabricación es: " +añocompu1.año);
        System.out.println("  ");
        
        System.out.println("La marca de la computadora es: " +compu2.marca);
        System.out.println("El modelo es: " +modelocompu2.modelo);
        System.out.println("El peso es: " +pesocompu2.peso + " kg");
        System.out.println("El año de fabricación es: " +añocompu2.año);
        System.out.println("  ");
        //////////////////////////////////////////////
        
                //////////////////////////////////////////////
        var moto1 = new Moto ();
        moto1.marca="Honda";
        var modelomoto1 = new Moto ();
        modelomoto1.modelo="CB150R Streetfire";
        var pesomoto1 = new Moto ();
        pesomoto1.peso=30.1f;
        var cilindrajemoto1 = new Moto ();
        cilindrajemoto1.cilindraje=150;
        
        var moto2 = new Moto ();
        moto2.marca="Honda";
        var modelomoto2 = new Moto ();
        modelomoto2.modelo="CB160R Streetfire";
        var pesomoto2 = new Moto ();
        pesomoto2.peso=32.1f;
        var cilindrajemoto2 = new Moto ();
        cilindrajemoto2.cilindraje=160;
        
        System.out.println("La marca de la computadora es: " +moto1.marca);
        System.out.println("El modelo es: " +modelomoto1.modelo);
        System.out.println("El peso es: " +pesomoto1.peso + " kg");
        System.out.println("El peso es: " +cilindrajemoto1.cilindraje + " cc");
        System.out.println("  ");
        
        System.out.println("La marca de la computadora es: " +moto2.marca);
        System.out.println("El modelo es: " +modelomoto2.modelo);
        System.out.println("El peso es: " +pesomoto2.peso + " kg");
        System.out.println("El peso es: " +cilindrajemoto2.cilindraje + " cc");
        System.out.println("  ");
        System.out.println("hola mundo");
        //////////////////////////////////////////////
    }
}
