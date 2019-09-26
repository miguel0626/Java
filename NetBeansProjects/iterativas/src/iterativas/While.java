/*Autor Miguel the king
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativas;
import java.util.Scanner;
/**
 *
 * @author adsi
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
         int maximo=0;
         int Nparticipantes=1;
         int Ndocumento;
         System.out.println("Registro de participantes");
         System.out.println("Ingrese el numero maximo de participantes");
         maximo=entrada.nextInt();
         System.out.println("Cupo maximo: "+maximo);
         while (Nparticipantes <= maximo) {
        System.out.println("Participante N. "+Nparticipantes);
        System.out.println("Por favor ingrese su numero de documento: ");
        Ndocumento=entrada.nextInt();
        Nparticipantes++;
    }
        System.out.println("No se pueden recibir mas participantes");
    }
    
}
