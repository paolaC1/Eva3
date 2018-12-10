/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_todos.los.ciclos.pkg18550693;

/**
 *
 * @author Paola Xochitl Carrillo Ortiz 18550693
 */
public class EVA3_2_TODOSLOSCICLOS18550693 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CUENTEN DEL 1 AL 100 Y DE 100 AL 1 
        //for, while, do while 
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " - ");           
        }
        
        
        
        int i = 0;
        do{
            i++;
            System.out.print(i + " - ");
        }while(i < 100);
    }
    
}
