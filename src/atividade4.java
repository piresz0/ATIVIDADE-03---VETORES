import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {

        int[] num = new int[3];

        Scanner entrada = new Scanner(System.in);


        num[0] = entrada.nextInt();
        num[1] = entrada.nextInt();
        num[2] = entrada.nextInt();

        entrada.close();

        System.out.println("Os numeros digitados são: " + num[0] + ", " + num[1] + ", " + num[2]);
        double media = (num[0] + num[1] + num[2]) / 3;

        System.out.println("A media dos numeros é: " + media);
    }

}
