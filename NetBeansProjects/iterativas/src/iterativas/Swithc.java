/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativas;

import java.util.Scanner;

public class Swithc {
    
    public static void main (String [] args) {
        
        Scanner input = new Scanner (System.in);
        
        int NumeroEstudiantes = 0;
        int NotaEstudiante = 0;
        int n =0;
        int n1= 0;
        int n2=0;
        int n3=0;
        int n4=0;
        int x=0;
        System.out.println("====Registro de calificaciones====");
        
        System.out.println("Ingrese el numero de Estudiantes");
        NumeroEstudiantes = input.nextInt();
        
        
        for (x=1;x<=NumeroEstudiantes;x++){
            
                System.out.println("Ingrese la nota del estudiante");
                NotaEstudiante = input.nextInt();
            switch(NotaEstudiante){
                case 10:
                case 9:
                    System.out.println("Excelente");
                    n1++;
                break;
                case 8:
                case 7:
                case 6:
                    System.out.println("Bueno");
                    n2++;
                break;
                case 5:
                case 4:
                    System.out.println("Regular");
                    n3++;
                break;
                case 3:
                case 2:
                case 1:
                    System.out.println("Malo");
                    n4++;
                break;
                default:
                    System.out.println("Ingrese una Calificacion Valida.");
                break;
            }   
           
        }
        System.out.println("La cantidad de estudiantes excelentes son: " + n1);
        System.out.println("La cantidad de estudiantes buenos son: " + n2);
        System.out.println("La cantidad de estudiantes regulares son: " + n3);
        System.out.println("La cantidad de estudiantes malos son: " + n4);
    }
}

