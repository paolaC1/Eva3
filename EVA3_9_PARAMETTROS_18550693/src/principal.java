/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paola Xochitl Carrillo Ortiz 18550693
 */
public class principal { //Clase --- Tipo de dato abstacto 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new principal ());
        principal mObjeto = new principal ();
        System.out.println(mObjeto);
        UnaClase ucObjeto2 = new UnaClase();
        System.out.println(ucObjeto2);
        
        int iValor = 5;
        incrementa(iValor);
        System.out.println("El valor es " + iValor);
        
        Valor vObjetovalor = new Valor();
        vObjetovalor.iValor =5;
        incrementa (vObjetovalor);
        System.out.println("El valor 2 es " + vObjetovalor.iValor);
                
        
        
                
    }
    public static void incrementa (int iVal){
        iVal++;
    }
    
    public static void incrementa (Valor vValor){
    vValor.iValor++;
    }
}

class UnaClase{}
class Valor{
int iValor;
}