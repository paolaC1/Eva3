/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paola Xochitl Carrillo Ortiz 1850693
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola");
        System.out.println(7);
        System.out.println("true");
        System.out.println(new Principal());//objeto
        System.out.println(suma(5,8));
        System.out.println(suma("hola","mundo"));
        
    }
    
    
    public static int suma(int iVal, int iVal2){
        return iVal + iVal2;
    }
    
     public static String suma(String sCade1, String sCade2){
        return sCade1 + sCade2;
    }
     
      public static void suma(int iVal){
   }  
}
