import java.util.Scanner;

public class TesteVetor{
    public static void main(String[] args){
        NossoVetor v1;
        System.out.println("Qual o tamanho do vetor?");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        v1 = new NossoVetor(t);

        NossoVetor v2 = new NossoVetor();

        int i = 1;
        while(!v1.estaCheio()) {
            v1.inserir(i);
            System.out.println(i++);
        }

        i = 1;
        while(v2.inserir(i)) {
            System.out.println(i++);
        }

        scanner.close();
    }
}