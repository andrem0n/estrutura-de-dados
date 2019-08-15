package exercicio_2;

public class ArranjoInteiros implements IArranjoInteiros {

    private int[] vetor;
    private int tamanho;

    public ArranjoInteiros(int tamanho){
        this.vetor = new int[tamanho];
    }

    @Override
    public void inserir(int valor, int posicao) {
            this.vetor[posicao] = valor;
    }

    @Override
    public void zerar(int posicao) {
        this.vetor[posicao] = 0;
    }

    @Override
    public int localizar(int posicao) {
        for (int i = 0; i < this.vetor.length; i++) {
            if (vetor[i] == posicao) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int buscarValor(int valor) {
        for (int i = 0; i < this.vetor.length; i++) {
            if (vetor[i] == valor) {
                return valor;
            }
        }
        return -1;
    }

    @Override
    public void ordenar() {
        int aux;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length-1-i; j++) {
                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    @Override
    public int informarTamanho() {
        return this.tamanho;
    }

    public void multiplicarVetor(int[] vetor, int multiplicador) {
        int[] aux = new int[10];

        for (int i = 0; i < vetor.length; i++) {          
            aux[i] = vetor[i];     
        }
        for (int i = 0; i < aux.length; i++) {
            aux[i] *= multiplicador;
            System.out.print("" + aux[i]+" "); 
        }
    }

    public int buscaValorRecursiva(int[] vet, int inicio, int fim, int valor) {
		int meio = (fim + inicio) / 2;
		int valorMeio = vet[meio];

		if (inicio > fim)
			return -1;
		else if(valorMeio == valor) 
			return meio;
		else if (valorMeio < valor)
			return buscaValorRecursiva(vet, meio+1, fim, valor);
		else
			return buscaValorRecursiva(vet, inicio, meio-1, valor);
	}

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        
        for (int i = 0; i < vetor.length-1; i++) {
            string.append(vetor[i]);
            string.append(", ");
        }

        if (vetor.length > 0) {
            string.append(vetor[vetor.length-1]);
        }

        string.append("]");
        return string.toString();
    }


    public int[] getVetor() {
        return this.vetor;
    }
}