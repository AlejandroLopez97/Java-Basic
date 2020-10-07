//se tiene 2 numeros enteros
 // realice un programa que muestre si son iguales o distintos .
 /*clase numero
  *metodo ppal()
  *
  *entero n 
  *imprima"Digite su numero"
  *si (n>0)
  *    imprima "es positivo"
  *    Sino
  *       si (n<0)
  *          imprima"es negativo"
  *        sino
  *          imprima "es cero"
  *       fin si 
  *fin si   
  */ 
import java.util.Scanner;
public class Numero {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    int n;
	System.out.println("Digite un numero");
	n = sc.nextInt();
	
	if (n>0){
		System.out.println("es positivo");
	}
	else {
		if (n<0){
			System.out.println("es negativo");
		}
		else {
			System.out.println("es cero");
		}
		
		
	}
	
	
    }
}
