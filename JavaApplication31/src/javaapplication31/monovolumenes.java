
package javaapplication31;
/**
 *
 * @author DanielOrtiz FedericoBornachera
 */
public class monovolumenes extends vehiculos{
    
    private int numero_puertas; 
    private boolean puertas_laterales;
    private int numero_asientos;
    private String tipo_motor;
    private String capacidad_carga;
    
    public monovolumenes(String marca, String placa, int numero_serie, double kilonmetros_recorrido, double cantidad_combustible_actual, int numero_puertas, boolean puertas_laterales, int numero_asientos, String tipo_motor, String capacidad_carga) {
        super(marca, placa, numero_serie, kilonmetros_recorrido, cantidad_combustible_actual);
        
        this.numero_puertas = numero_puertas;
        this.puertas_laterales = puertas_laterales;
        this.numero_asientos = numero_asientos;
        this.tipo_motor = tipo_motor;
        this.capacidad_carga = capacidad_carga;
        
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public void setPuertas_laterales(boolean puertas_laterales) {
        this.puertas_laterales = puertas_laterales;
    }

    public void setNumero_asientos(int numero_asientos) {
        this.numero_asientos = numero_asientos;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public void setCapacidad_carga(String capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }
    
    public String mostrar_info(){
        
       String pl = "";
        if (this.puertas_laterales){
            pl = "si";
        }else{
            pl = "no";
        }
               
        String info_monovolumenes = mostrar_info_vehiculos()+"\t"+numero_puertas+"\t"+pl+"\t"+numero_asientos+"\t"+tipo_motor+"\t"+capacidad_carga; 
        return info_monovolumenes;
    
    }
    
    
    
}
