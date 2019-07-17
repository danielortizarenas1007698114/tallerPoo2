
package javaapplication31;

/**
 *
 * @author DanielOrtiz FedericoBornachera
 */

import java.util.*;

public class JavaApplication31 {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);       
       motos moto1 = new motos("susuki","abc123",1234567890,12.34,56.78);
       carro_turismo ct1 = new carro_turismo("toyota", "lj57c", 789456123, 78.94, 123.2, "acuatico", 6, "hardry 8.5");
       carro_deportivo cd1 = new carro_deportivo("audi", "fc45h", 1082863254, 4578.235, 123456.2, 5.6, 2, true, 2);
       carro_4x4 c4_1 = new carro_4x4("ford", "lj56b", 123456789, 456.6, 13.46, "diesel", 4);
       
        System.out.println(moto1.mostrar_info());
       
        System.out.println(ct1.mostrar_info());
        
        System.out.println(cd1.mostrar_info());
        
        System.out.println(c4_1.mostrar_info());
        
       
        
        
        
    }
    
}
