import java.util.Scanner;
public class pin{
public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int intento, pin = 1234, veces = 0;
    
    do{
        System.out.print("Ingresa la clave");
        intento = entrada.nextInt(); //almaceno entrada del usuario
        if(intento == pin){
            System.out.println("¡Acesso correcto!");
            System.out.println("¡Bienvenido!");
            veces = 3; // contador indica el numero del ciclo
        } else {
            System.out.println("NIP CORRECTO");
            veces = veces+1; // incremento el numero de intentos
            if(veces==3){ System.out.println("¡No puedes entrar!..");
            System.out.printf("Bloqueando tus esperanzas con ella");}
        }
        
    }while(veces < 3);
  }
} 