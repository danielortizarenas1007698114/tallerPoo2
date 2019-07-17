
package javaapplication31;
/**
 *
 * @author DanielOrtiz FedericoBornachera
 */
public class carro_turismo extends vehiculos{
    
    private String tipo;
    private int numero_puertas;
    private String tipo_motor;
    
    public carro_turismo(String marca, String placa, int numero_serie, double kilonmetros_recorrido, double cantidad_combustible_actual, String tipo, int numero_puertas, String tipo_motor) {
        super(marca, placa, numero_serie, kilonmetros_recorrido, cantidad_combustible_actual);
        
        this.tipo = tipo;
        this.numero_puertas = numero_puertas;
        this.tipo_motor = tipo_motor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
    
    
    public String mostrar_info(){
        
        String info_carro_turismo = mostrar_info_vehiculos()+"\t"+tipo+"\t"+numero_puertas+"\t"+tipo_motor;
        return info_carro_turismo;
        
    }
    
}
