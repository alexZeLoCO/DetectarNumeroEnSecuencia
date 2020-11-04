import java.util.Scanner;		//SCANNER
public class DetectarNumeroEnSecuencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//TECLADO
		int n=0;		//INICIALIZA N 
		System.out.print("Introducir secuencia de n�meros: ");		//SOLICITA VALOR
		
		do {
			n = teclado.nextInt();		//PIDE VALOR
			
			if (n%5==0) {		//SI HAY M�LTIPLO DE 5
				System.out.println("La secuencia contiene un m�ltiplo de 5.");		//OUTPUT
			}
			if (n%2==1) {		//SI HAY UN N�MERO IMPAR
				System.out.println("La secuencia contiene un n�mero impar.");		//OUTPUT
			}
			if (n<0 && n%2==0 && n%5==1) {		//SI NO HAY NI IMPAR NI M�LTIPLO DE 5
				System.out.print("La secuencia no contiene ning�n valor impar o m�ltiplo de 5.");		//OUTPUT
			}
		} while (n>=0 && n%2==0 && n%5!=0); 		//CONDICI�N
	
	}
}
