import java.util.Random;

public class NossoVetor {
    private int ocupacao;
    private int[] vetor;

    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }
    public NossoVetor(){
        vetor = new int[10];
        ocupacao = 0;
    }
    // Reutilizando código
/*     public NossoVetor(){
        this(10)
    } */
/*     public NossoVetor(int tamanho, int ocupacao){
        this(tamanho);
        this.ocupacao = ocupacao; 
        // O this é usado quando há ambiguidade no nome da variável (ocupacao pode ser o atributo da classe e o parâmetro do construtor)
    } */

    public boolean inserir (int elemento){
        if(!estaCheio()){
            vetor[ocupacao++] = elemento; // Faz o incremento junto com a inserção
            return true;
        }
        return false;
    }

    public boolean estaCheio(){
        return ocupacao == vetor.length;
    }

    public void preencheVetor(){
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao = vetor.length;
    }

    public void bubbleSort(){
        for(int i = 1; i < vetor.length; i++){
            for(int j = 0; j < vetor.length - i; j++){
                if(vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    public void insertionSort () {
        for (int j = 1; j < vetor.length; ++j) {
            int x = vetor[j];
            int i;
            for (i = j-1; i >= 0 && vetor[i] > x; --i) 
                vetor[i+1] = vetor[i];
            vetor[i+1] = x;
        }
    }
}