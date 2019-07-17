
package javaapplication31;
/**
 *
 * @author DanielOrtiz FedericoBornachera
 */
public class carro_4x4 extends vehiculos{

    private String tipo_motor;
    private int numero_asientos; 
    
    public carro_4x4(String marca, String placa, int numero_serie, double kilonmetros_recorrido, double cantidad_combustible_actual, String tipo_motor, int numero_asientos ) {
        super(marca, placa, numero_serie, kilonmetros_recorrido, cantidad_combustible_actual);
        
        this.tipo_motor = tipo_motor;
        this.numero_asientos = numero_asientos;
       
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public void setNumero_asientos(int numero_asientos) {
        this.numero_asientos = numero_asientos;
    }
    
    public String mostrar_info(){
        
        String info_carro_4x4 = mostrar_info_vehiculos()+"\t"+tipo_motor+"\t"+numero_asientos;
        return info_carro_4x4;
        
    }
    
    
    
    
}
