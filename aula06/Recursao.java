public class Recursao{
    static long fatorial (int n) {
        if(n < 2) return 1; // caso de parada
        return n * fatorial(n - 1);
    }

    static long fibonacci(int n){
        if(n < 3) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static double potenciaLaco(int base, int expoente){
        if(expoente == 0) return 1;
        if(expoente < 0){
            base = 1 / base;
            expoente = -expoente;
        }
        double pot = base;
        for(int i = 1; i < expoente; pot *= base, i++);  
        return pot;
        
    }

    static int potenciaRec(int base, int i, int expoente){
        if(i == expoente) return base;
        return base * potenciaRec(base, i + 1, expoente);
    }

    static int potenciaRec(int base, int expoente){
        if(expoente == 0) return 1;
        return base * potenciaRec(base, expoente - 1);
    }
    // construir um método recursivo para somar valores de 1 a n
    static int soma1aNRec(int n){
        if(n <= 1) return n;
        return n + soma1aNRec(n - 1);
    }
    // construir um método iterativo para somar os dígitos de um número
    static int somaDigitoIterativo(int n){
        int s = 0;
        while(n > 0){
            s += n % 10;
            n = n / 10;
        }
        return s;
    }
    // construir um método recursivo para somar os dígitos de um número
    static int somaDigitoRec(int n){
        if(n == 0) return 0;
        return n % 10 + somaDigitoRec(n / 10);
    }
    // construir um método recursivo para somar os números de um vetor
    static int somaVetRec(int[] v, int pos){
        if(pos == v.length - 1) return v[v.length - 1];
        return v[pos] + somaVetRec(v, pos + 1);
    }
    // Contruir uma função recursiva que receba um inteiro impar e calcule e fatorial duplo. Ex: 5!! = 1 * 3 * 5
    static int fatorialDuplo(int n) {
        if (n == 1) return 1;
        return n * fatorialDuplo(n - 2);
    }

    public static void main(String[] args){
/*         for (int i = 0; i < 30; i++){
            System.out.println("fatorial de  " + i + " = " + fatorial(i));
        } */

/*         for (int i = 1; i <= 50; i++){
            System.out.println("fibonacci em " + i + ": " + fibonacci(i));
        } */

       System.out.println("3 a quarta: " + potenciaLaco(3, 4));
       System.out.println("3 a quarta: " + potenciaRec(3, 1, 4));
       System.out.println("3 a quarta: " + potenciaRec(3, 4));
       System.out.println("A soma de 1 a n eh: " + soma1aNRec(5));
       System.out.println("fatorial duplo: " + fatorialDuplo(5));

    }
}