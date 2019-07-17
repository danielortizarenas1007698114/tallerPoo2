
package javaapplication31;
/**
 *
 * @author DanielOrtiz FedericoBornachera
 */
public class carro_deportivo extends vehiculos{
    
    private double caballo_potencia;
    private int numero_puertas;
    private boolean turbo;
    private int numero_asientos;
    
    public carro_deportivo(String marca, String placa, int numero_serie, double kilonmetros_recorrido, double cantidad_combustible_actual, double caballo_potencia, int numero_puertas, boolean turbo, int numero_asientos) {
        super(marca, placa, numero_serie, kilonmetros_recorrido, cantidad_combustible_actual);
    
        this.caballo_potencia = caballo_potencia;
        this.numero_puertas = numero_puertas;
        this.turbo = turbo;
        this.numero_asientos = numero_asientos;
    
    }

    public void setCaballo_potencia(double caballo_potencia) {
        this.caballo_potencia = caballo_potencia;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public void setNumero_asientos(int numero_asientos) {
        this.numero_asientos = numero_asientos;
    }
    
    
    public String mostrar_info(){
        
        String rummrumm = "";
        if (this.turbo){
            rummrumm = "si";
        }else{
            rummrumm = "no";
        }
        
        String info_carro_deportivo = mostrar_info_vehiculos()+"\t"+caballo_potencia+"\t"+numero_puertas+"\t"+rummrumm+"\t"+numero_asientos;
        return info_carro_deportivo;
    
    }
    
    
}
