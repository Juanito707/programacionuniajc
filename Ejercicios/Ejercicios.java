import java.util.Scanner;
import java.util.Arrays;

public class Ejercicios {

    public String Ejercicio1 (){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño: ");
        int n = sc.nextInt();

        int numeros[] = new int[n];

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= (int) (Math.random()*100)+1;
            suma+=numeros[i];
        }


        return "Suma: "+suma;
    }

    


}