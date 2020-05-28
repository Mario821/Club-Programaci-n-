 
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

public static void main(String[] args) {
Scanner entradaEscaner = new Scanner(System.in);
System.out.println("Ejercicio2");
 System.out.print("Ingrese una cadena de números:: ");
 String numero_sumador = entradaEscaner.nextLine();
 int valor = Ejercicio2(numero_sumador);
 System.out.println(valor);
}
 public static int Ejercicio2(String numero) {
while(numero.length() > 1 ) {
ArrayList<String> numeros = new ArrayList<String>();
for (int i = 0; i < numero.length(); i++) {
numeros.add(Character.toString(numero.charAt(i)));
}

int valor = 0;
System.out.print("suma ");
for (int i = 0; i < numeros.size(); i++) {
valor = valor + Integer.parseInt(numeros.get(i));

System.out.print(numeros.get(i));
if(i == numeros.size() - 1) {
System.out.print(" = ");
}else {
System.out.print(" + ");
}
}
System.out.println(valor);
numero = Integer.toString(valor);
}

return Integer.parseInt(numero);
}
}