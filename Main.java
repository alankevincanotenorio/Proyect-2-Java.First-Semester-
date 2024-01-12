/** Clase Principal
 * @author Alan Kevin Cano Tenorio, Malinalli Escobedo Irineo
 * @version 1.0 
 */
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Jerigonza j = new Jerigonza();
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		do{
			System.out.println("Jerigonzas\nEscoje una opcion\n[1] Cifrar frase con Idioma Letra\n" + 
			"[2] Descifrar frase en idioma letra\n[3] Cifrar frase con Idioma del Ladron\n" + 
            "[4] Descifrar frase en idioma ladron\n[5] Aplicar vesre\n" + "[6] Cerrar programa\n");
			opcion = entrada.nextInt();
			switch(opcion){
                case 1:
                System.out.println("Ingresa la cadena que deseas cifrar");
                entrada.nextLine();  
                String mensaje1 = entrada.nextLine();
                System.out.println("Ingresa la consonante con la que quieres que  se cifre tu cadena");
                char x = entrada.next().charAt(0);
                System.out.println("Tu mensaje cifrado es: "+j.cifraIdiomaLetra(mensaje1, x));
                break;
                case 2:
                System.out.println("Ingresa la cadena que deseas decifrar");
                entrada.nextLine();  
                String mensaje2 = entrada.nextLine();
                System.out.println("Tu mensaje decifrado es: "+j.descifraIdiomaLetra(mensaje2));
                break;
                case 3:
                System.out.println("Ingresa la cadena que deseas cifrar");
                entrada.nextLine();
                String mensaje3 = entrada.nextLine();
                System.out.println("Ingresa una vocal con la que se cifrara");
                char v = entrada.next().charAt(0);
                System.out.println(j.cifraIdiomaLadron(mensaje3, v));
                break;
                case 4:
                System.out.println("Ingresa la cadena que deseas decifrar");
                entrada.nextLine();  
                String mensaje4 = entrada.nextLine();
                System.out.println("Tu mensaje decifrado es: "+j.descifraIdiomaLadron(mensaje4));
                break;
				case 5: 
                System.out.println("Ingresa la cadena que deseas cifrar o decifrar");
                entrada.nextLine();  
                String mensaje5 = entrada.nextLine();
                System.out.println("Tu mensaje cifrado/decifrado es: "+j.aplicaVesre(mensaje5));
				break;
                case 6: 
                System.out.println( "Fin del programa");
                entrada.close();
				break;
				default: System.out.println("Esa opción no existe, elige otra");
			}
		}
        while( opcion!=6);
    }
}