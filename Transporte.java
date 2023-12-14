
package com.mycompany.trasporte;

public class Trasporte {

    public static void main(String[] args) {
        Moto motouno= new Moto("motocicleta", 3, "BMW");
        Auto autouno= new Auto("Buseta", 17, "Chevrolet");
        
        motouno.conducir();
        System.out.println(motouno.marca);
        System.out.println(motouno.tipoVehiculo);
        System.out.println(motouno.pasajeros);
        autouno.conducir();
        System.out.println(autouno.marca);
        System.out.println(autouno.tipoVehiculo);
        System.out.println(autouno.pasajeros);
       
    }
}
