
import java.util.Scanner;
public class Variosnombres {

    public static void main(String[] args) {//inicio ppal
        Scanner sc = new Scanner (System.in);
    	int i;
    	String nom;
       	System.out.print("Digite su nombre: ");
       	System.out.println();
       	for (i=1; i<=10;i++){//inicio para 
       
       	nom = sc.next();
       	System.out.println("Su nombre es: " +nom);
       	}//fin para 
    }//fin ppal 
    
    
}