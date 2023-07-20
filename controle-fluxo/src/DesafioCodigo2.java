import java.util.Scanner;

public class DesafioCodigo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];

        System.out.println("Iniciando array...");

        for (int i = 0; i < 10; i++)
            nomes[i] = scanner.nextLine();

        scanner.close();

        System.out.println("Item: " + nomes[2]);
        System.out.println("Item: " + nomes[6]);
        System.out.println("Item: " + nomes[8]);
    }
}
