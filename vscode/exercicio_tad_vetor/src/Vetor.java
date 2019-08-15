
public class Vetor implements IVetor {

    private int numElementos;
    private int[] vetor;


    public Vetor(int tamanho) {
        this.vetor = new int[tamanho];
        this.numElementos = 0;
    }
    

    @Override
    public boolean add(int item) {
        if (!isFull()) {
            vetor[numElementos] = item;
            numElementos++;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(int item) {
        for (int i = 0; i < numElementos; i++) {
            if (vetor[i] == item) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int indice) {
        return vetor[indice];
    }

    @Override
    public int indexOf(int item) {
        for (int i = 0; i < numElementos; i++) {
            if (item == vetor[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        if (numElementos == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (this.numElementos == vetor.length) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int item) {
        int indice = indexOf(item);
        if (indice != -1) {
            for (int i = indice; i < numElementos-1; i++) {
                vetor[i] = vetor[i+1];
            }
            numElementos--;
            return true;
        }
        return false;
    }

    @Override
    public boolean set(int indice, int novoItem) {
        for (int i = 0; i < numElementos; i++) {
            if (indice == i) {
                vetor[i] = novoItem;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return numElementos;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        
        for (int i = 0; i < numElementos-1; i++) {
            string.append(vetor[i]);
            string.append(", ");
        }

        if (numElementos > 0) {
            string.append(vetor[numElementos-1]);
        }

        string.append("]");
        return string.toString();
    }

    @Override
    public void bubbleSort() {
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
    public void insertionSort() {

    }

    @Override
    public int buscaBinaria(int item) {
        int m, e = 0;
        int d = this.vetor.length-1;

        while (e <= d) {
            m = (e + d)/2;

            if (this.vetor[m] == item) {
                return item;
            }
            else if (this.vetor[m] < d) {
                e = m + 1;
            }
            else {
                d = m - 1;
            }
        }        
        return -1;
    }
}