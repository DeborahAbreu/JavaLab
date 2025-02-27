import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero de publicações: ");
        int numeroPublicacoes = entrada nexInt();

        for (int i = 1; i <= numeroPublicacoes; i++) {
            System.out.printf("Curtidas para a publicação #%d: ", i):
            int numeroCurtidas = entrada.nexInt();
            totalCurtidas = totalCurtidas + numeroCurtidas;

            if (numeroCurtidas >= 100) {
                System.out.println("\tPublicação Popular!")
            }
            else {
                System.out.println("\tPublicação com poucas curtidas");
            }
        }
        double mediaCurtidas = totalCurtidas/numeroPublicacoes;
        System.out.printf("Média de curtidas = %.1f\n", mediaCurtidas);
        System.out.printf("Numero de publicações = %.d\n", numeroPublicacoes);
        entrada.close();
}