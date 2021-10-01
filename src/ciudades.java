import java.util.Scanner;

public class ciudades {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de ciudades: ");
        int indice  = Integer.parseInt(teclado.nextLine());


        String ciudades[] = new String [indice];

        for (int i = 0; i < indice; i++){

            System.out.println("Ingrese la ciudad número "+ i);
            ciudades[i] = teclado.nextLine();
        }


        for (String i:ciudades){
            System.out.println("Ciudad: "+ i);
        }
    }
}
