import java.util.Scanner;

public class Semana04_NumeroIngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número (1-6): ");
        int numero = scanner.nextInt();
        String ingles;

        switch (numero) {
            case 1:
                ingles = "One";
                break;
            case 2:
                ingles = "Two";
                break;
            case 3:
                ingles = "Three";
                break;
            case 4:
                ingles = "Four";
                break;
            case 5:
                ingles = "Five";
                break;
            case 6:
                ingles = "Six";
                break;
            default:
                ingles = "Número fuera de rango";
        }

        System.out.println("El número ingresado en inglés es: " + ingles);
    }
}
