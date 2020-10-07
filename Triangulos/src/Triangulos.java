/**
 * Realice un programa para ingresar 3 lados de un triangulo y muestre 
 *si es equilatero, escaleno o isoceles 
 *
 *clase Triangulos
 *metodo ppal()
 *real l1, l2, l3
 * 
 *imprima "ingrese el primer lado "
 *lea l1
 *imprima "ingrese el segundo lado "
 *lea l2
 *imprima "ingrese el tercer lado "
 *lea l3
 *
 *   Si(l1=l2 ^ l2=l3)
 *   imprima "es equilatero"
 *   Sino 
 *       si (l1<>l2 ^ l2<>l3 ^ l3<>l1)
 *        imprima "es escaleno"
 *       sino 
 *        imprima "es isosceles"
 *       fin si 
 *   fin si 
 *fin metodo ppal
 *fin clase 
 */
 import java.util.Scanner;
public class Triangulos {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        float l1, l2, l3;
    	System.out.println("Digite el primer lado !");
    	l1 = sc.nextFloat();
    	System.out.println("Digite el segundo lado !");
    	l2 = sc.nextFloat();
    	System.out.println("Digite el tercer lado !");
    	l3 = sc.nextFloat();
    	
    	if (l1==l2 && l2==l3){
    		System.out.print("es equilatero");
    	}
    	else {
    		if(l1!=l2 && l2!=l3 && l3!=l1){
    			System.out.print("es ecaleno");
    		}
    		else {
    				System.out.print("es isosceles");
    		}
    	}
    }
}
