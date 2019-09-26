package iterativas;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        int valor_compra=0;
        int x=1;
        double descuento=0;
        int compra=0;
        int producto=0;
        double pagar=0;
        int i=0;
        int cantidad=0;
        
        System.out.println("=======================================================");
        System.out.println("Cliente N°"+x);
        System.out.println("=======================================================");
        System.out.println("=======================================================");
        System.out.println("Lista de precios");
        System.out.println("1.Manzana(uni).......$700");
        System.out.println("2.Pera(uni).......$800");
        System.out.println("3.Lulo(uni).......$1200");
        System.out.println("4.Banano(uni).......$600");
        System.out.println("5.Fresa(uni).......$1300");
        System.out.print("Que producto desea comprar: ");
        compra = input.nextInt();
        System.out.print("Cuantos productos desea comprar: ");
        cantidad= input.nextInt();
        System.out.println("=======================================================");
        
        
        for (x=1;x<=1;x++){
        switch(compra)
        {
            case 1:
                producto=700;
                i=producto*cantidad;
                valor_compra=valor_compra+i;
                break;
            case 2:
                producto=800;
                i=producto*cantidad;
                valor_compra=valor_compra+i;
                break;
            case 3:
                producto=1200;
                i=producto*cantidad;
                valor_compra=valor_compra+i;
                break;
            case 4:
                producto=600;
                i=producto*cantidad;
                valor_compra=valor_compra+i;
                break;
            case 5:
                producto=1300;
                i=producto*cantidad;
                valor_compra=valor_compra+i;
                break;
            default:
                System.out.println("Ingrese un codigo valido");
        }
        }
        descuento=valor_compra*0.20;
        pagar=valor_compra *0.8;
        System.out.println("El valor de su compra es de: "+valor_compra);
        System.out.println("Su descuento es de: "+descuento);
        System.out.println("El total a pagar es de: "+pagar);
        
        
                System.out.println("=======================================================");
                System.out.println("Cliente N°"+x);
                System.out.println("=======================================================");
                System.out.println("=======================================================");
                System.out.println("Lista de precios");
                System.out.println("1.Manzana(uni).......$700");
                System.out.println("2.Pera(uni).......$800");
                System.out.println("3.Lulo(uni).......$1200");
                System.out.println("4.Banano(uni).......$600");
                System.out.println("5.Fresa(uni).......$1300");
                System.out.print("Que producto desea comprar: ");
                compra = input.nextInt();
                System.out.print("Cuantos productos desea comprar: ");
                cantidad= input.nextInt();
                System.out.println("=======================================================");


                for (x=2;x<=2;x++){
                switch(compra)
                {
                    case 1:
                        producto=700;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    case 2:
                        producto=800;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    case 3:
                        producto=1200;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    case 4:
                        producto=600;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    case 5:
                        producto=1300;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    default:
                        System.out.println("Ingrese un codigo valido");
                }
                }
                descuento=valor_compra*0.15;
                pagar=valor_compra *0.85;
                System.out.println("El valor de su compra es de: "+valor_compra);
                System.out.println("Su descuento es de: "+descuento);
                System.out.println("El total a pagar es de: "+pagar);
                
                
                System.out.println("=======================================================");
                System.out.println("Cliente N°"+x);
                System.out.println("=======================================================");
                System.out.println("=======================================================");
                System.out.println("Lista de precios");
                System.out.println("1.Manzana(uni).......$700");
                System.out.println("2.Pera(uni).......$800");
                System.out.println("3.Lulo(uni).......$1200");
                System.out.println("4.Banano(uni).......$600");
                System.out.println("5.Fresa(uni).......$1300");
                System.out.print("Que producto desea comprar: ");
                compra = input.nextInt();
                System.out.print("Cuantos productos desea comprar: ");
                cantidad= input.nextInt();
                System.out.println("=======================================================");


                for (x=2;x<=2;x++){
                switch(compra)
                {
                    case 1:
                        producto=700;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    case 2:
                        producto=800;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    case 3:
                        producto=1200;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    case 4:
                        producto=600;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    case 5:
                        producto=1300;
                        i=producto*cantidad;
                        valor_compra=valor_compra+i;
                        break;
                    default:
                        System.out.println("Ingrese un codigo valido");
                }
                }
                descuento=valor_compra*0.10;
                pagar=valor_compra *0.9;
                System.out.println("El valor de su compra es de: "+valor_compra);
                System.out.println("Su descuento es de: "+descuento);
                System.out.println("El total a pagar es de: "+pagar);
    }
}
