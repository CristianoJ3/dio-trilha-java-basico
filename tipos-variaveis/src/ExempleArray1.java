import java.util.Scanner;

public class ExempleArray1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int i;
        int maior = 0;

        /// Neste exemplo são armazenados cinco números
        /// informados pelo usuário e, após a execução do for,
        /// é informado qual o maior número armazenado
        for (i = 0; i < 5; i++) {

            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior)
                maior = numero;

        }

        System.out.println("\nO maior número é: " + maior);
        System.out.println("\nSaindo do laço for!!!\n");

        /// Neste exemplo o usuário informa a quantidade de números que deseja informar
        int quantNumeros;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        /// Durante a execução são armazenados os números de acordo com a quantidade
        /// informada
        /// pelo usuário e, então, informado a quantidade de números pares e ímpares.
        do {
            System.out.println("\nNúmero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                quantPares++;
            else
                quantImpares++;

            count++;

        } while (count < quantNumeros);

        System.out.println("\nSaindo do laço do while!!!\n");

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de ímpares: " + quantImpares);

    }
}
