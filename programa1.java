 

import java.util.ArrayList;
import java.util.Scanner;

public class programa1 {
	public static void main(String[] args) {
		Scanner entradaEscaner = new Scanner(System.in);

		System.out.println("Ejercicio #1");
		System.out.print("Ingrese un número positivo:: ");
		int numero = entradaEscaner.nextInt();
        String serie = ejercicio1(numero);
        System.out.println(serie);

      
	}
	
	public static String ejercicio1(int numero) {
		String serie = "" + numero;
		while(numero != 1 && numero > 1) {
			if(numero%2 == 0) {
				numero = numero/2;
			}else {
				numero = (numero * 3) + 1;
			}
			serie = serie + " " + numero;
		}
		return serie;
	}


}