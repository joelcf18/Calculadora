package practicaGit;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		    double a, b;
		    int opcion;

		    do {
		         System.out.println("Introduce el primer n�mero: ");
		         a = scanner.nextDouble();
		         System.out.println("Introduce el segundo n�mero: ");
		         b = scanner.nextDouble();
		            
		         Operacion operacion = new Operacion(a, b);

		         System.out.println("�Qu� operaci�n quieres realizar?"
		         +"\n1. Suma"
		         +"\n2. Resta"
		         +"\n3. Multiplicaci�n"
		         +"\n4. Divisi�n");
		         opcion = scanner.nextInt();

		         switch (opcion) {
		             case 1:
		                 System.out.println("El resultado de la suma es: " + operacion.suma());
		                 break;
		             case 2:
		                 System.out.println("El resultado de la resta es: " + operacion.resta());
		                 break;
		             case 3:
		                 System.out.println("El resultado de la multiplicaci�n es: " + operacion.multiplicacion());
		                 break;
		             case 4:
		                 System.out.println("El resultado de la divisi�n es: " + operacion.division());
		                 break;
		             default:
		                 System.out.println("Opci�n no v�lida.");
		                 break;
		            }

		         System.out.println("�Quieres realizar otra operaci�n? (1: S� / 0: No)");
		         opcion = scanner.nextInt();

		     } while (opcion == 1);

		     System.out.println("Fin del programa.");

		    }

		}