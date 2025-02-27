import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do custo de produção:");
        float custoProducao = entrada.nextFloat();
        System.out.println("Digite o valor do ingresso:");
        Float valorIngresso = entrada.nextFloat();
        Scanner custoproducao = new Scanner(System.in);
        int a = (int) Math.ceil(custoProducao/valorIngresso);
        System.out.println("A quantidade de convites que deve ser vendidos para que o custo do espetaculo seja alcançado é: %d\n"+ a);
        int b = (int) Math.ceil((custoProducao * 1.23) / valorIngresso);
        System.out.println("A quantidade de convites que deve ser vendidos para obter um lucro de 23%% é: %d\n"+ b);

    }
    
}
