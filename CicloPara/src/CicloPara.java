/**
 *Realice un programa que permita ingresar el nombre de una persona y lo muestre 10 veces 
 *
 *clase CicloPara
 *metodo ppal()
 *i es entero 
 *nom es caracter 
 *
 *imprima "Digite su nombre: "
 *lea nom 
 *
 *para (i=1 hasta 10,1)
 *imprima "Su nombre es: ", nom 
 *fin para 
 *
 *fin metodo ppal 
 *fin clase 
 */
 import java.util.Scanner;
public class CicloPara {
    
    public static void main(String[] args) {//inicio ppal
        Scanner sc = new Scanner (System.in);
    	int i;
    	String nom;
       	System.out.print("Digite su nombre: ");
       	nom = sc.next();
       	System.out.println();
       	for (i=1; i<=10;i++){//inicio para 
       	System.out.println("Su nombre es: " +nom);
       	}//fin para 
    }//fin ppal 
}// fin clase 
