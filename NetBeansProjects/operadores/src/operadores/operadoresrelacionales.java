/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;
import java.util.Scanner;
/**
 *
 * @author FORMACIÓN
 */
public class operadoresrelacionales {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
         System.out.println("Ingrese el primer numero");
         int n1=input.nextInt();
         System.out.println("Ingrese el segundo numero");
         int n2=input.nextInt();
         
         if (n1==n2){
         System.out.println("Ambos numeros no pueden ser iguales");}
         if (n1>n2){
         System.out.println("El numero: "+n1+" Es mayor que el numero: "+n2);}
         if (n2>n1){
         System.out.println("El numero: "+n2+" Es mayor que el numero: "+n1);}
}
}