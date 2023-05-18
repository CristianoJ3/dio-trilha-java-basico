public class EstudoJavaDio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String concatenacao = "?";

        concatenacao = 1 + 1 + "1" + 1;
        System.out.println(concatenacao);

        int numero = -1;

        System.out.println(numero);

        numero = -numero;

        System.out.println(numero);

        int a, b;

        a = 5;
        b = 6;

        String resposta = a > b ? "true" : "false";

        System.out.println(resposta);

        if (a != b && b < numero || a > b) {
            System.out.println("Condição verdadeira!");
        } else {
            System.out.println("Condição falsa!");
        }
    }
}
