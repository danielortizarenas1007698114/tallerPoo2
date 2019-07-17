
package javaapplication31;
/**
 *
 * @author DanielOrtiz FedericoBornachera
 */
public class motos extends vehiculos{
    
    public motos(String marca, String placa, int numero_serie, double kilonmetros_recorrido, double cantidad_combustible_actual) {
        super(marca, placa, numero_serie, kilonmetros_recorrido, cantidad_combustible_actual);
    }
    
    public String mostrar_info(){
        
        String info_moto = mostrar_info_vehiculos();
        return info_moto;
        
    }
      
}
