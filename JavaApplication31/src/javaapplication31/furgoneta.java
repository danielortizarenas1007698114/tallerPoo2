
package javaapplication31;
/**
 *
 * @author DanielOrtiz FedericoBornachera
 */
public class furgoneta extends vehiculos{
    
    private String capacidad_carga;
    private double altura;
    
    public furgoneta(String marca, String placa, int numero_serie, double kilonmetros_recorrido, double cantidad_combustible_actual, String capacidad_carga, double altura) {
        super(marca, placa, numero_serie, kilonmetros_recorrido, cantidad_combustible_actual);
        
        this.capacidad_carga = capacidad_carga;
        this.altura = altura;
        
    }

    public void setCapacidad_carga(String capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    public String mostrar_info(){
        
        String info_furgoneta = mostrar_info_vehiculos()+"\t"+capacidad_carga+"\t"+altura;
        return info_furgoneta;
        
    }
    
    
    
    
}
