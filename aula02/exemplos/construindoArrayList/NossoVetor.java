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

    @Override
}