
package javaapplication31;
/**
 *
 * @author DanielOrtiz FedericoBornachera
 */
public abstract class vehiculos {
   
        protected String marca;
        protected String placa;
        protected int numero_serie;
        protected double kilonmetros_recorrido;
        protected double cantidad_combustible_actual;

        public abstract vehiculos(String marca, String placa, int numero_serie, double kilonmetros_recorrido, double cantidad_combustible_actual){
                
            this.marca = marca;
            this.placa = placa;
            this.numero_serie = numero_serie;
            this.kilonmetros_recorrido = kilonmetros_recorrido;
            this.cantidad_combustible_actual = cantidad_combustible_actual;
                
        }
        
        public void setMarca(String marca){
            this.marca = marca;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public void setNumero_serie(int numero_serie) {
            this.numero_serie = numero_serie;
        }

        public void setKilonmetros_recorrido(double kilonmetros_recorrido) {
            this.kilonmetros_recorrido = kilonmetros_recorrido;
        }

        public void setCantidad_combustible_actual(double cantidad_combustible_actual) {
            this.cantidad_combustible_actual = cantidad_combustible_actual;
        }
        
        
        
        public String mostrar_info_vehiculos(){
            
            String info_vehiculo = marca+"\t"+placa+"\t"+numero_serie+"\t"+kilonmetros_recorrido+"\t"+cantidad_combustible_actual;            
            return info_vehiculo;
            
        }
        
}
