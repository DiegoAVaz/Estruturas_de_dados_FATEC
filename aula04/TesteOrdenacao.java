import java.util.Scanner;
import java.util.Date;

public class TesteOrdenacao {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int t;

        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        NossoVetor v;
        while(t > 0){
            long ini, fim;
            v = new NossoVetor(t);
            v.preencheVetor();
            // System.out.println("vetor original\n" + v);
            v.preencheVetor();
            ini = new Date().getTime();
            c.insertionSort();
            fim = new Date().getTime;
            System.out.println();

            Date d = new Date();
            ini = d.getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("Bubble demorou " + (fim - ini) + " milissegundos");
            // System.out.println("Vetor ordenaod pelo bubble\n" + v);


            System.out.print("Digite o novo tamanho. 0 encerra");
            t = scanner.nextInt();
        }

        scanner.close();
    }
}