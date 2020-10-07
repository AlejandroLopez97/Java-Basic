/**se tienen 2 numeros enteros, realice un programa que muestre si son iguales o distintos. 
 *
 *clase NumerosEnteros
 *metodo ppal()
 *int a, b
 *imprima "Digite su primer numero: "
 *lea a  
 *imprima "Digite su segundo numero: "
 *lea b
 *   Si (a=b)
 *       imprima "los numeros son iguales "
 *       sino 
 *          imprima "son diferentes " 
 *    fin si
 *fin metodo ppal
 *fin clase 
 */
 import java.util.Scanner;
public class NumerosEnteros {
    
    public static void main(String[] args) {
    	Scanner teclado = new Scanner (System.in);
    	int a, b;
    	System.out.println("Digite su primer numero!");
    	a = teclado.nextInt();
    	System.out.println("Digite su primer numero!");
    	b = teclado.nextInt();
    	
    	if (a==b){
    		System.out.println("Son iguales ");
    	
    	}
    	else {
    			System.out.println("Son Diferentes ");
    	}
    	
    }
}
