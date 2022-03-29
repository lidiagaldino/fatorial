import java.util.Scanner;
class Fatorial {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int n = ler.nextInt();
        int mult = 1;
        for (int i = 2; i <= n ; i++) {
            mult *= i;
        }
        System.out.println("Fatorial de "+n+": "+mult);
        ler.close();
    }
}