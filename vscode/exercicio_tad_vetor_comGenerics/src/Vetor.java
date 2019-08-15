import java.lang.reflect.Array;

public class Vetor<E> implements IVetor<E> {

    private int numElementos;
    private E[] vetor;


    public Vetor(int numElementos) {
        this.numElementos = numElementos;
        this.vetor = (E[]) new Vetor[numElementos];
    }

    

    @Override
    public boolean add(E item) {
        if (!isFull()) {
            vetor[numElementos] = item;
            numElementos++;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(E item) {
        for (int i = 0; i < numElementos; i++) {
            if (vetor[i] == item) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(E indice) {
        return vetor[indice];
    }

    @Override
    public int indexOf(E item) {
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
    public boolean remove(E item) {
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
    public boolean set(E indice, E novoItem) {
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

}