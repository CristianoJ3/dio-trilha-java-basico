public class ExampleArray2 {
    public static void main(String[] args) {

        int[] vetor = { -5, -2, 15, 50, 8, 4 };

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
