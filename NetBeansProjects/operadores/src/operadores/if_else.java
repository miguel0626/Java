/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operadores;
import java.util.Scanner;

/**
 *
 * @author Sena
 */
public class if_else {
     public static void main(String[] args) {
              Scanner input = new Scanner(System.in);

        String  contra="123";
        String contra1;
        
        System.out.println("Ingrese la contraseña");
        
            contra1 =input.nextLine();
        if (contra1.equals(contra))
        {
            System.out.println("Bienvenido");
            
        }
        else{
        System.out.println("ERROR");
        }
    
     }
}
