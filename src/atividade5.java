import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome 1: ");
        nomes[0] = sc.nextLine();
        System.out.println("Digite o nome 2: ");
        nomes[1] = sc.nextLine();
        System.out.println("Digite o nome 3: ");
        nomes[2] = sc.nextLine();

        sc.close();
        System.out.println(nomes[0] + " " + nomes[1] + " " + nomes[2]);

    }
}
