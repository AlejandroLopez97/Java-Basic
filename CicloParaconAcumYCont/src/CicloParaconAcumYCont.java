/**
 * @(#)CicloParaconAcumYCont.java
 *
 * CicloParaconAcumYCont application
 *
 * @author 
 * @version 1.00 2015/3/24
 */
 import java.util.Scanner;
public class CicloParaconAcumYCont {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n, i, cont1=0,cont2=0,cont3=0,cont4=0,acum=0;
    	float prom;
    
    	for (i=1;i<=10;i++){
    		
    	    System.out.print("Digite el numero: ");
    		n = sc.nextInt();
    		acum = acum+n;
    		if (n%5==0){
    			cont1=cont1+1;
    		}//fin si 
    	     if (n>0){
    	     	cont2=cont2+1;
    	     }else {
    	     	if(n<0){
    	     	   cont3=cont3+1;
    	     	}else {
    	     			cont4=cont4+1;
    	     	}
    	     }//fin condicional anidado
    	}//fin para 
    	prom = acum/10;
    	System.out.print("El promedio es: " +prom);
    	System.out.print("\nHay " +cont1+ " multiplos de 5 ");
    	System.out.print("\nHay " +cont2+ " numeros positivos ");
    	System.out.print("\nHay " +cont3+ " numeros negativos ");
    	System.out.print("\nHay " +cont4+ " ceros ");
    }
}
