/*Miguel the king
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativas;
import java.util.Scanner;
/**
 *
 * @author FORMACIÓN
 */
public class do_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String ClaveUser ="";
        String ClaveBD = "1234";
        int NumeroIntentos = 0;
        System.out.println("Login");
        do{
            System.out.print("Ingrese la clave: ");
            ClaveUser = entrada.next();
            NumeroIntentos++;
            
            System.out.println("Intento "+ NumeroIntentos);
        }while (!ClaveUser.equals(ClaveBD) && NumeroIntentos < 3);
        
        if (NumeroIntentos == 3 && !ClaveUser.equals(ClaveBD))
        {
            System.out.println("Acceso no permitido");
        }
        else
        {
            System.out.println("Bienvenido");
        }
    }
    
}