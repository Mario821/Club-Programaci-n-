import java.util.ArrayList;
import java.util.Scanner;

public class EJERCICIO4 {
	public static void main(String[] args) {
		Scanner entradaEscaner = new Scanner(System.in);

System.out.println("\n\nEJERCICIO #4");
 System.out.println("Ingrese un número:: ");
int numero_desordenado = entradaEscaner.nextInt();
 int iteraciones = ejercicio4(numero_desordenado);
 System.out.println(iteraciones);
}
public static int ejercicio4(int numero) {
ArrayList<Integer> numeros = new ArrayList<Integer>();

while(numero >= 0 && numeros.indexOf(numero) == -1) {
numeros.add(numero);
String num = Integer.toString(numero);
int serie[] = new int[num.length()];
for (int i = 0; i < num.length(); i++) {
serie[i] = Integer.parseInt(Character.toString(num.charAt(i)));
}

int numero_asc = intArrayToInt(orden_asc(serie));
int numero_desc = intArrayToInt(orden_desc(serie));
int resultado = numero_desc - numero_asc;
numero = resultado;

System.out.print(numero_desc + " - ");
System.out.print(numero_asc + " = ");
System.out.println(resultado);
}
return numeros.size();
}

    static int[] orden_asc(int[] numero_array) {
    int arreglo[] = numero_array;
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int min = i;

            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = aux;
            }
        }
        return arreglo;
    }

    static int[] orden_desc(int[] numero_array) {
    int arreglo[] = numero_array;
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;

            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;
                }
            }

            if (i != max) {
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
        return arreglo;
    }

    static int intArrayToInt(int[] numero_array) {
    String numero = "";
    for (int i : numero_array) {
numero = numero + Integer.toString(i);
}
    return Integer.parseInt(numero);
    }


}
