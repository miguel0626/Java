/*AUTOR:MiguelDiaz*/
package operadores;

import java.util.Scanner;

public class calculadora {
        
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op=0;
        int num1=0;
       int num2=0;
       int res=0;
System.out.println("Elige una opcion");
System.out.println("1.Suma");
System.out.println("2.Resta");
System.out.println("3.Multiplicacion");
System.out.println("4"
        + ".División");

op=input.nextInt();

        if (op==1) {
            System.out.println("SUMA");
       
       
       System.out.println("Ingrese el primer numero a sumar");
    num1 = input.nextInt();
    System.out.println ("Ingrese el segundo numero a sumar");
    num2 = input.nextInt();
    
    res=num1+num2;
    
    System.out.println("El resultado de la suma es: "+res);
            
        }


        if (op==2) {
              System.out.println("RESTA");
    
    System.out.println("Ingrese el primer numero a restar");
    num1=input.nextInt();
    System.out.println("Ingrese el segundo numero a restar");
    num2=input.nextInt();
    
    res=num1-num2;
    
    System.out.println("El resultado de la suma es: "+res);
            
        }
        if (op==3) {
              System.out.println("MULTIPLICACION");
    
    System.out.println("Ingrese el primer numero a MULTIPLICAR");
    num1=input.nextInt();
    System.out.println("Ingrese el segundo numero a multiplicar");
    num2=input.nextInt();
    
    res=num1*num2;
    
    System.out.println("El resultado de la multiplicacin es: "+res);
            
        }
        if (op==4) {
              System.out.println("DIVICION");
    
    System.out.println("Ingrese el primer numero a dividir");
    num1=input.nextInt();
    System.out.println("Ingrese el segundo numero a dividir");
    num2=input.nextInt();
    
    res=num1/num2;
    
    System.out.println("El resultado de la division es: "+res);
            
        }
    
    }
    
}