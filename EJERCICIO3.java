import java.util.ArrayList;
import java.util.Scanner;

public class EJERCICIO3 {
	public static void main(String[] args) {
		Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("\n\nEJERCICIO #3");
 System.out.print("Ingrese dos números separados por un espacio en blanco:: ");
 String numero_dividido = entradaEscaner.nextLine();
        int diferencia = ejercicio3(numero_dividido);
        System.out.println(diferencia);
    }
public static int ejercicio3(String numeros) {
String num1 = "";
String num2 = "";
Boolean espaciado = false;

for (int i = 0; i < numeros.length(); i++) {
if(numeros.charAt(i) == ' ') {
espaciado = true;
} else {
if(espaciado) {
num2 = num2 + numeros.charAt(i);
}else {
num1 = num1 + numeros.charAt(i);
}
}
}

int diferencia = Integer.parseInt(num1) - Integer.parseInt(num2);
if(diferencia < 0) {
diferencia = diferencia * -1;
}
return diferencia;
}
}
