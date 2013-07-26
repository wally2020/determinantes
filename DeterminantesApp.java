/*
 * Determinantes de una matriz NXN
 * Por: Aldo Hernández Suárez
 * aldhersu@gmail.com
 */

/**
 *
 * @author Aldo Hernández
 * @version 1.0
 */
public class DeterminantesApp {
    
    public static void main(String args[]){
    
        double[][] matriz = {{1,0,1},{1,-1,0},{1,2,1}};
        double d;
        
        Determinantes determina = new Determinantes();
        d = determina.determinante(matriz);
        
        System.out.println(d);
    
    
    }
    
}
