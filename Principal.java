package practicaGit;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		    double a, b;
		    int opcion;

		    do {
		         System.out.println("Introduce el primer número: ");
		         a = scanner.nextDouble();
		         System.out.println("Introduce el segundo número: ");
		         b = scanner.nextDouble();
		            
		         Operacion operacion = new Operacion(a, b);

		         System.out.println("¿Qué operación quieres realizar?"
		         +"\n1. Suma"
		         +"\n2. Resta"
		         +"\n3. Multiplicación"
		         +"\n4. División");
		         opcion = scanner.nextInt();

		         switch (opcion) {
		             case 1:
		                 System.out.println("El resultado de la suma es: " + operacion.suma());
		                 break;
		             case 2:
		                 System.out.println("El resultado de la resta es: " + operacion.resta());
		                 break;
		             case 3:
		                 System.out.println("El resultado de la multiplicación es: " + operacion.multiplicacion());
		                 break;
		             case 4:
		                 System.out.println("El resultado de la división es: " + operacion.division());
		                 break;
		             default:
		                 System.out.println("Opción no válida.");
		                 break;
		            }

		         System.out.println("¿Quieres realizar otra operación? (1: Sí / 0: No)");
		         opcion = scanner.nextInt();

		     } while (opcion == 1);

		     System.out.println("Fin del programa.");

		    }

		}