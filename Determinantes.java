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

public class Determinantes {
    
    public Determinantes(){}
    
    public double determinante(double[][] mat){
        
        int longitud = mat.length;
        double suma = 0;
        int cnt = 0;
        double[][] aux = new double[longitud-1][longitud-1];
        
        if(longitud == 2){
        
            suma = mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
            return suma;
        
        }
        
        for (int d1 = 0; d1 < longitud ; d1 ++){
            
            for(int d2 = 0; d2 < longitud-1 ; d2++){
            
                for(int d3 = 0; d3 < longitud ; d3++){
                
                    if(d3==d1){continue;}
                    
                    aux[d2][cnt] = mat[d2+1][d3];
                
                    cnt++;
                
                } cnt  = 0;
                
            
            
            }
        
            if(d1%2==0){
                
                suma+=mat[0][d1]*determinante(aux);
            
            
            }
            
            else{
            
                suma-=mat[0][d1]*determinante(aux);
            
            
            }
        
        
        }
    
    
        return suma;
    }
    
}
