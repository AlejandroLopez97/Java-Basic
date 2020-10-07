/**
 *de un estudiante se obtiene el nombre, cedula, estrato y valor de la matricula
 *se desea saber el descuento y el valor total de la matricula sabiendo que 
 */
 import java.util.Scanner;
public class Estudiante {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String nom, cedu;
        int estrat;
        double valorm, valort, des=0;	
    	System.out.println("\n\n==> INGRESO DATOS == ");
    	System.out.print("Nombre..............................:");
    	nom = sc.next();
    	System.out.print("Cedula..............................:");
    	cedu = sc.next();
    	System.out.print("Estrato.............................:");
    	estrat = sc.nextInt();
    	System.out.print("Valor de matricula..................:");
    	valorm = sc.nextDouble();
    	
    	switch (estrat) {
    	
    		
    		case 0: 
    			des = valorm*0.40;
    			
    			
    			break;
    		
    		case 1:
    			des = valorm*0.30;
    			
    			break;
    			
    		case 2:
    			des = valorm*0.20;
    		
    			break; 
    		
    		case 3:
    			des = valorm*0.10;
    	
    			break;
    			
    		case 4:
    			des = valorm*0.05;
    			
    			break;
    			
    		case 5:
    		
    			break;
    			
    		case 6:
    			
    			break;	
    			
    			default: 
    				System.out.println("Estrato no valido");	
    			
    	}
    	
    	valort = valorm - des;
    	
    	System.out.println("\n\n ==> VALORES <==");
    	System.out.println("\n-----------" + " " + "-------------");
    	System.out.println("\n --Valor  " + " " + "---- Descuento " );
    	System.out.println("\n --" + valort + " " + " "+ " " + "---" + des);
    	System.out.println("\n-----------" + " " + "-------------");				
    }
}
