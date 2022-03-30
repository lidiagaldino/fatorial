import java.util.Scanner;
class Fatorial {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int v = 1;
        while (v == 1) {
            long mult = 1;
            System.out.println("Insira um número inteiro positivo: ");
            int n = ler.nextInt();
            while (n < 0) {
                System.out.println(n+" = Número inválido. Digite novamente: ");
                n = ler.nextInt();
            }
            for (int i = 2; i <= n ; i++) {
                mult *= i;
            }
            System.out.println("Fatorial de "+n+": "+mult);
            System.out.println("Deseja calcular novamente? \n1. Sim\n2. Não");
            v = ler.nextInt();
            if (v == 2) {
                System.out.println("Bye!");
            }
        }
        ler.close();
    }
}