
package com.mycompany.trasporte;

public class Auto extends Vehiculo{
    
    public Auto(String tipoVehiculo, Integer pasajeros, String marca) {
        super(tipoVehiculo , pasajeros, marca);
        
        
    }
    public void conducir(){
        System.out.println("Se encuentra en el auto");
        encender();
      
        
    }
}
