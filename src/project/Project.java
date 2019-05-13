/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Float;

public class Project {

    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("||\tFUNCIONES                                     ||");
        System.out.println("||----------------------------------------------------||");
        System.out.println("||\t 1 .-> f(x) = (x+2)-3+5                       ||");
        System.out.println("||\t 2 .-> f(x) = 3x + 6                          ||");
        System.out.println("||\t 3 .-> f(x) = x^2                             ||");
        System.out.println("||\t 4 .-> f(x) = x^2+1                           ||");
        System.out.println("||\t 5 .-> f(x) = x+5/2+2                         ||");
        System.out.println("||\t 6 .-> f(x) = (x-4)(5+7)                      ||");
        System.out.println("||\t 7 .-> f(x) = x^3/2                           ||");
        System.out.println("||\t 8 .-> f(x) = 2x^2+3x-4                       ||");
        System.out.println("||\t 9 .-> f(x) = (3x-2)(x+1)                     ||");
        System.out.println("||\t 10.-> f(x) = 5x/3                             ||");
        System.out.println("=======================================================");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("eliga una función --->");
        int funcion= sc.nextInt();
        while (funcion >10 || funcion<1){
            System.out.println("****seleccion incorrecta****");
            System.out.println("eliga la función --->");
            funcion= sc.nextInt();
        }
        switch(funcion){
            case 1:            
                System.out.println("La función seleccionada es: \n\tf(x) = (x+2)-3+5 ");
                System.out.println("ingresa primer valor x.1");
                int x1= sc.nextInt();               
                System.out.println("\ningresa valor para x.2");
                int x2= sc.nextInt();
                System.out.println("\ningresa valor para x.3");
                int x3= sc.nextInt();
                System.out.println("\ningresa valor para x.4");
                int x4= sc.nextInt();
                System.out.print("el valor de y.1 es:");
                System.out.print((x1+2)-3+5);
                System.out.print("\nel valor de y.2 es:");
                System.out.print((x2+2)-3+5);
                System.out.print("\nel valor de y.3 es:");
                System.out.print((x3+2)-3+5);
                System.out.print("\nel valor de y.4 es:");
                System.out.print((x4+2)-3+5);
                System.out.print("\n\t FIN \t\t");
               
                break;
            case 2:
                System.out.println("La función seleccionada es: \n\tf(x) = 3x + 6 ");
                System.out.println("ingresa primer valor x.1");
                x1= sc.nextInt();               
                System.out.println("ingresa valor para x.2");
                x2= sc.nextInt();
                System.out.println("ingresa valor para x.3");
                x3= sc.nextInt();
                System.out.println("ingresa valor para x.4");
                x4= sc.nextInt();
                System.out.print("\nel valor de y.1 es:");
                System.out.print((3*x1)+6);
                System.out.print("\nel valor de y.2 es:");
                System.out.print((3*x2)+6);
                System.out.print  ("\nel valor de y.3 es:");
                System.out.print((3*x3)+6);
                System.out.print("\nel valor de y.4 es:");
                System.out.print((3*x4)+6);
                System.out.print("\n\t FIN \t\t");
                break;
            case 3:  
                System.out.println("La función seleccionada es: \n\tf(x) = x^2 ");
                System.out.println("ingresa primer valor x.1");
                x1= sc.nextInt();               
                System.out.println("ingresa valor para x.2");
                x2= sc.nextInt();
                System.out.println("ingresa valor para x.3");
                x3= sc.nextInt();
                System.out.println("ingresa valor para x.4");
                x4= sc.nextInt();
                System.out.print("\nel valor de y.1 es:");
                int resultado = (int)(Math.pow(x1,2));
                System.out.print(resultado);
                System.out.print("\nel valor de y.2 es:");
                resultado = (int)(Math.pow(x2,2));
                System.out.print(resultado);
                System.out.print("\nel valor de y.3 es:");
                resultado = (int)(Math.pow(x3,2));
                System.out.print(resultado);
                System.out.print("\nel valor de y.4 es:");
                resultado = (int)(Math.pow(x4,2));
                System.out.print(resultado);
                System.out.print("\n\t FIN \t\t");              
                break;
            case 4:
                System.out.println("La función seleccionada es: \n\tf(x) = x^2+1 ");
                System.out.println("La función seleccionada es: \n\tf(x) = x^2 ");
                System.out.println("ingresa primer valor x.1");
                x1= sc.nextInt();               
                System.out.println("ingresa valor para x.2");
                x2= sc.nextInt();
                System.out.println("ingresa valor para x.3");
                x3= sc.nextInt();
                System.out.println("ingresa valor para x.4");
                x4= sc.nextInt();
                System.out.print("\nel valor de y.1 es:");
                resultado = (int)(Math.pow(x1,2)+1);
                System.out.print(resultado);
                System.out.print("\nel valor de y.2 es:");
                resultado = (int)(Math.pow(x2,2)+1);
                System.out.print(resultado);
                System.out.print("\nel valor de y.3 es:");
                resultado = (int)(Math.pow(x3,2)+1);
                System.out.print(resultado);
                System.out.print("\nel valor de y.4 es:");
                resultado = (int)(Math.pow(x4,2)+1);
                System.out.print(resultado);
                System.out.print("\n\t FIN \t\t");                              
                break;
            case 5:               
                System.out.println("La función seleccionada es: \n\tf(x) = x+5/2+2 ");
                System.out.println("ingresa un valor para x.1");
                float n1 = sc.nextFloat();
                float s1 = 5;
                float s2 =2;
                float s3 =2;
                float div = (float) (n1 + s1 / s2+s3) ;
                System.out.println("el valor de y1 es:->"+div);
                System.out.println("ingresa un valor para x.2");
                float n2 = sc.nextFloat();
                div = (float) (n2 + s1 / s2+s3) ;
                System.out.println("el valor de y2 es:->"+div);
                System.out.print("\n\t FIN \t\t");
                break;
            case 6:
                System.out.println("La función seleccionada es: \n\tf(x) = (x-4)(5+7) ");
                System.out.println("ingresa primer valor x.1");
                x1= sc.nextInt();               
                System.out.println("ingresa valor para x.2");
                x2= sc.nextInt();
                System.out.println("ingresa valor para x.3");
                x3= sc.nextInt();
                System.out.println("ingresa valor para x.4");
                x4= sc.nextInt();
                System.out.print("\nel valor de y.1 es:");
                System.out.print((x1-4)*(5+7));
                System.out.print("\nel valor de y.2 es:");
                System.out.print((x2-4)*(5+7));
                System.out.print("\nel valor de y.3 es:");
                System.out.print((x3-4)*(5+7));
                System.out.print("\nel valor de y.4 es:");
                System.out.print((x4-4)*(5+7));
                System.out.print("\n\t FIN \t\t");              
                break;
            case 7:
                System.out.println("La función seleccionada es: \n\tf(x) = x^3/2");                     
                System.out.println("ingresa el valor para x.1");
                x1= sc.nextInt();           
                float d = 2;
                float div3 = (float) (Math.pow(x1, 2) / d) ;
                System.out.println("el valor de y.1 es:->"+div3);                               
                System.out.println("ingresa el valor para x.2");
                x2= sc.nextInt();           
                d = 2;
                div3 = (float) (Math.pow(x2, 2) / d) ;
                System.out.println("el valor de y.1 es:->"+div3);
                System.out.print("\n\t FIN \t\t"); 
                break;
            case 8:
                System.out.println("La función seleccionada es: \n\tf(x) = 2x^2+3x-4");
                System.out.println("ingresa el valor para x.1");
                x1= sc.nextInt();
                System.out.print("\nel valor de y.1 es:");
                resultado = (int)(2 * Math.pow(x1,2)+3*x1-4);
                System.out.print(resultado);
                System.out.println("\ningresa el valor para x.2");
                x2= sc.nextInt();
                System.out.print("\nel valor de y.2 es:");
                resultado = (int)(2 * Math.pow(x2,2)+3*x2-4);
                System.out.print(resultado);
                System.out.print("\n\t FIN \t\t");
                
                break;
            case 9:
                System.out.println("La función seleccionada es: \n\tf(x) = (3x-2)(x+1)");
                System.out.println("ingresa primer valor x.1");
                x1= sc.nextInt();               
                System.out.println("ingresa valor para x.2");
                x2= sc.nextInt();
                System.out.println("ingresa valor para x.3");
                x3= sc.nextInt();
                System.out.println("ingresa valor para x.4");
                x4= sc.nextInt();
                System.out.print("\nel valor de y.1 es:");
                System.out.print((3*x1-2)*(x1+1));
                System.out.print("\nel valor de y.2 es:");
                System.out.print((3*x2-2)*(x2+1));
                System.out.print("\nel valor de y.3 es:");
                System.out.print((3*x3-2)*(x3+1));
                System.out.print("\nel valor de y.4 es:");
                System.out.print((3*x4-2)*(x4+1));
                System.out.print("\n\t FIN \t\t");
                
                break;
            case 10:  
                System.out.println("La función seleccionada es: \n\tf(x) = 5x/3 ");
                System.out.println("ingresa el valor para x.1");
                x1= sc.nextInt();           
                float ds =3;
                float div2 = (float) (5*x1 / ds) ;
                System.out.println("el valor de y.1 es:->"+div2);
                System.out.println("ingresa el valor para x.2");
                x2= sc.nextInt();           
                div2 = (float) (5*x2 / ds) ;
                System.out.println("el valor de y.1 es:->"+div2);
                break;
        }
     ////    
    }   
}
