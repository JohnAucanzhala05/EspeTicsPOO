
package com.mycompany.trasporte;

abstract public class Vehiculo {
    
   public String tipoVehiculo;
   public Integer pasajeros;
   public String marca;
   private String placa;
   
   public Vehiculo (String tipoVehiculo, Integer pasajeros, String marca){
       this.tipoVehiculo= tipoVehiculo;
       this.pasajeros= pasajeros;
       this.marca= marca; 
   }
   
   public String getplaca(){
       return placa;
       
       
   } 
   public void setplaca(String placa){
       this.placa= placa;
   }
   
   public void encender(){
       System.out.println("encendido ");
   }
   
   public void apagar(){
       System.out.println("apagado");
   }
   abstract void conducir();
   
}
