import java.util.Scanner;		//SCANNER
public class DetectarNumeroEnSecuencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//TECLADO
		int n=0;		//INICIALIZA N 
		System.out.print("Introducir secuencia de números: ");		//SOLICITA VALOR
		
		do {
			n = teclado.nextInt();		//PIDE VALOR
			
			if (n%5==0) {		//SI HAY MÚLTIPLO DE 5
				System.out.println("La secuencia contiene un múltiplo de 5.");		//OUTPUT
			}
			if (n%2==1) {		//SI HAY UN NÚMERO IMPAR
				System.out.println("La secuencia contiene un número impar.");		//OUTPUT
			}
			if (n<0 && n%2==0 && n%5==1) {		//SI NO HAY NI IMPAR NI MÚLTIPLO DE 5
				System.out.print("La secuencia no contiene ningún valor impar o múltiplo de 5.");		//OUTPUT
			}
		} while (n>=0 && n%2==0 && n%5!=0); 		//CONDICIÓN
	
	}
}
